package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.model.MemberModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */

public interface MemberDao {

    List<MemberModel> getMemberListForNewLoan(int societyId);

    MemberModel getSelectedMember(int memId);

    List<MemberModel> getPendingApproveLoanList(int societyId);

    boolean saveMember(MemberModel memberModel);
}
