package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.CustomerFeedbackDao;
import edu.ijse.gdse39.microfinance.dao.LoanDao;
import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.dao.UserDao;
import edu.ijse.gdse39.microfinance.dto.LoanAddInfoDto;
import edu.ijse.gdse39.microfinance.dto.LoanDto;
import edu.ijse.gdse39.microfinance.dto.LoanProductDto;
import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.model.*;
import edu.ijse.gdse39.microfinance.service.LoanService;
import edu.ijse.gdse39.microfinance.service.helper.NumberToWordConverter;
import edu.ijse.gdse39.microfinance.service.mapper.DtoToModelMapper;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
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
    public boolean saveNewLoan(LoanAddInfoDto loanAddInfoDto, ArrayList<MemberDto> groupList,MemberDto selectedMember,ArrayList<LoanProductDto> loanProductList) {
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

        Serializable result = loanDao.saveNewLoan(loanModel);
        if(null != result){
            Serializable result2 = customerFeedbackDao.saveFeedback(customerFeedbackDataModel);
            if (null != result2){
                return true;
            }
        }
        return false;

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
