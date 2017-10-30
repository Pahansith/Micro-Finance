package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.GroupDao;
import edu.ijse.gdse39.microfinance.dao.LoanDao;
import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.dao.impl.MemberDaoImpl;
import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.model.GroupModel;
import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.MemberService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberDao memberDao;

    @Autowired
    GroupDao groupDao;

    @Autowired
    LoanDao loanDao;

    @Override
    public ArrayList<MemberDto> getMemberListForLoan(int soceityId) {
        List<MemberModel> memberListForNewLoan = memberDao.getMemberListForNewLoan(soceityId);
        return new ModelToDtoMapper().mapMemberModelList(memberListForNewLoan);
    }

    @Override
    public MemberDto getSelectedMember(int memId) {
        MemberModel selectedMember = memberDao.getSelectedMember(memId);
        return new ModelToDtoMapper().mapMemberModel(selectedMember);
    }

    @Override
    public ArrayList<MemberDto> getPendingApproveLoanList(int societyId) {
        List<MemberModel> pendingApproveLoanList = memberDao.getPendingApproveLoanList(societyId);
        return new ModelToDtoMapper().mapMemberModelList(pendingApproveLoanList);
    }

    @Override
    public boolean saveMember(Map<String, String> requestParams) {
        MemberModel memberModel = new MemberModel();
        memberModel.setAddress_1(requestParams.get("address_1"));
        memberModel.setAddress_2(requestParams.get("address_2"));
        memberModel.setAddress_3(requestParams.get("address_3"));
        memberModel.setEmployeeStatus(getEmployeeStatus(requestParams.get("business")));
        memberModel.setFinancialStatus(getFinancialStatus(requestParams.get("financial")));
        memberModel.setfName(requestParams.get("fName"));
        memberModel.setlName(requestParams.get("lName"));
        memberModel.setHometown(requestParams.get("hometown"));
        memberModel.setMobile(requestParams.get("mobile"));
        memberModel.setNic(requestParams.get("nic"));
        memberModel.setSalutation(getSalutation(requestParams.get("salutation")));
        GroupModel groupModel = groupDao.searchSelectedGroup(Integer.parseInt(requestParams.get("groupList")));
        memberModel.setGroupModel(groupModel);
        return memberDao.saveMember(memberModel);

    }

    private MemberModel.SALUTATION getSalutation(String s) {
        switch (s){
            case  "Mr" : return MemberModel.SALUTATION.Mr;
            case  "Mrs" : return MemberModel.SALUTATION.Mrs;
            case  "Ms" : return MemberModel.SALUTATION.Ms;
            case  "Ven" : return MemberModel.SALUTATION.Ven;
            case  "Dr" : return MemberModel.SALUTATION.Dr;
            default: return null;
        }
    }

    private MemberModel.FINANCIAL_STATUS getFinancialStatus(String s) {
        switch (s){
            case  "Good" : return MemberModel.FINANCIAL_STATUS.GOOD;
            case  "Potentially Growth" : return MemberModel.FINANCIAL_STATUS.POTENTIALLY_GROWTH;
            case  "Stable" : return MemberModel.FINANCIAL_STATUS.STABLE;
            case  "Risky" : return MemberModel.FINANCIAL_STATUS.RISKY;
            default: return null;
        }
    }

    private MemberModel.EMPLOYEE_STATUS getEmployeeStatus(String s) {
        switch (s){
            case  "Owned" : return MemberModel.EMPLOYEE_STATUS.OWNED;
            case  "Government" : return MemberModel.EMPLOYEE_STATUS.GOVERNMENT;
            case  "Private" : return MemberModel.EMPLOYEE_STATUS.PRIVATE;
            default: return null;
        }
    }
}
