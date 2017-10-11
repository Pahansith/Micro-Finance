package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.MemberModel;

import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */

public interface MemberDao {

    List<MemberModel> getMemberListForNewLoan(int societyId);

    MemberModel getSelectedMember(int memId);
}
