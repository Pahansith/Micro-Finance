package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.*;
import edu.ijse.gdse39.microfinance.dto.*;
import edu.ijse.gdse39.microfinance.model.*;
import edu.ijse.gdse39.microfinance.service.LoanService;
import edu.ijse.gdse39.microfinance.service.helper.NumberToWordConverter;
import edu.ijse.gdse39.microfinance.service.mapper.DtoToModelMapper;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanDao loanDao;

    @Autowired
    MemberDao memberDao;

    @Autowired
    UserDao userDao;

    @Autowired
    CustomerFeedbackDao customerFeedbackDao;

    @Autowired
    LoanScheduleDao loanScheduleDao;

    @Override
    public ArrayList<LoanDto> getCustomerPreviousLoanList(int customerId) {
        List<LoanModel> customerPreviousLoanList = loanDao.getCustomerPreviousLoanList(customerId);
        return new ModelToDtoMapper().mapLoanModelList(customerPreviousLoanList);
    }

    @Override
    public ArrayList<LoanProductDto> getLoanProductList() {
        List<LoanProductModel> modelList = loanDao.getLoanProductList();
        return new ModelToDtoMapper().mapLoanProductList(modelList);
    }

    @Override
    public String saveNewLoan(LoanAddInfoDto loanAddInfoDto, ArrayList<MemberDto> groupList,MemberDto selectedMember,ArrayList<LoanProductDto> loanProductList) {
        DtoToModelMapper mapper = new DtoToModelMapper();
        LoanModel loanModel = mapper.mapLoanInfoDtoToLoanModel(loanAddInfoDto);

        LoanProductModel loanProductModel = getSelectedLoanProduct(loanProductList,loanAddInfoDto.getLoanProductId());


        MemberModel selectedMember1 = memberDao.getSelectedMember(selectedMember.getMemberId());
        CustomerFeedbackDataModel customerFeedbackDataModel =new DtoToModelMapper().mapMemberFeedback(loanAddInfoDto,selectedMember1);
        int[] ids = getGuarentorIDsForSelectedLoan(groupList,selectedMember.getMemberId());

        String[] parts = loanProductModel.getDefPeriod().split("[W]");
        loanModel.setPeriodInMonths(Integer.parseInt(parts[0]));
        double defIntRate = loanProductModel.getDefIntRate();

        loanModel.setIntRateStr(new NumberToWordConverter().convert((int)defIntRate));

        SystemUser selectedSystemUser = userDao.getSelectedSystemUser(loanAddInfoDto.getLoggedInUserId());
        loanModel.setApprovedUser(selectedSystemUser);
        loanModel.setLoanStatus("SAVED");
        loanModel.setIntRate(defIntRate);
        loanModel.setGuarentor1(ids[0]);
        loanModel.setGuarentor2(ids[1]);
        loanModel.setMemberModel(selectedMember1);
        loanModel.setLoanProductModel(loanProductModel);
        loanModel.setLoanNumber(getNewLoanNumber(selectedMember1));
        Serializable result = loanDao.saveNewLoan(loanModel);
        if(null != result){
            Serializable result2 = customerFeedbackDao.saveFeedback(customerFeedbackDataModel);
            if (null != result2){
                return "Loan has successfully added\n Loan number is : "+Integer.toString(loanModel.getLoanNumber());
            }
        }
        return "Failed";

    }

    private int getNewLoanNumber(MemberModel memberModel) {
        Integer memberId = memberModel.getMemberId();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        return Integer.parseInt(df.format(new Date())+memberId);
    }

    @Override
    public CustomerFeedbackDataDto getCustomerFeedback(int memId) {
        CustomerFeedbackDataModel customerFeedbackDataModel = customerFeedbackDao.getFeedbackDataOfCustomer(memId);
        return new ModelToDtoMapper().mapFeedbackModel(customerFeedbackDataModel);
    }

    @Override
    public LoanDto getCustomerLoanDetailsForApproval(Integer memberId) {
        LoanModel loanModel = loanDao.getCustomerLoanDetailsForApproval(memberId);
        return new ModelToDtoMapper().mapLoanModel(loanModel);
    }

    @Override
    public boolean approveLoan(MemberDto selectedMember, LoanDto customerLoanDetail) {
        LoanModel customerLoanDetailsForApproval = loanDao.getApproveLoanModelOfCustomer(customerLoanDetail.getLoanId());
        customerLoanDetailsForApproval.setLoanStatus("APPROVED");
        ArrayList<LoanScheduleModel> loanScheduleList = calculateLoanSchedule(customerLoanDetailsForApproval);
        boolean isSaved = loanDao.approveLoan(customerLoanDetailsForApproval);
        if (!isSaved){
            return false;
        }
        for (LoanScheduleModel loanSchedule :
                loanScheduleList) {
            boolean isScheduleSaved = loanScheduleDao.saveLoanSchedule(loanSchedule);
            if(!isScheduleSaved){
                return false;
            }
        }
        return true;
    }

    private ArrayList<LoanScheduleModel> calculateLoanSchedule(LoanModel loan) {
        ArrayList<LoanScheduleModel> loanScheduleList = new ArrayList<>();
        int periodInMonths = loan.getPeriodInMonths();
        int weeks = periodInMonths*4;
        double intRate = loan.getIntRate();
        double approvedLoanAmount = loan.getApprovedLoanAmount();
        double totalPayment = (intRate*approvedLoanAmount/100)+approvedLoanAmount;
        int weekPayment =  (int)totalPayment/weeks;
        Date date = new Date(); // Start date today
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        for(int i = 0; i<weeks; i++){
            c.setTime(date);
            c.add(Calendar.DATE, 7);
            date = c.getTime();// number of days to add
            String nextDay = sdf.format(c.getTime());
            LoanScheduleModel loanScheduleModel = new LoanScheduleModel((double)weekPayment,nextDay,loan);
            loanScheduleList.add(loanScheduleModel);
        }
        return loanScheduleList;
    }


    private int[] getGuarentorIDsForSelectedLoan(ArrayList<MemberDto> groupList, Integer memberId) {
        int[] idArr = new int[2];
        int i = 0;
        for (MemberDto member :
                groupList) {
            if (!member.getMemberId().equals(memberId)){
                idArr[i++] = member.getMemberId();
            }
        }
        return idArr;
    }

    private LoanProductModel getSelectedLoanProduct(ArrayList<LoanProductDto> loanProductList, int loanProductId) {
        for (LoanProductDto loanProductDto:
             loanProductList) {
            if (loanProductDto.getId() == loanProductId){
                return new DtoToModelMapper().mapLoanProductDto(loanProductDto);
            }
        }
        return null;
    }
}
