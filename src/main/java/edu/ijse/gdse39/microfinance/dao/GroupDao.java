package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.GroupModel;
import edu.ijse.gdse39.microfinance.model.MemberModel;

import java.util.List;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */

public interface GroupDao {
    List<MemberModel> getMemberGroupDetails(int memberId);

    List<GroupModel> getGroupBySociety(int societyId);

    GroupModel searchSelectedGroup(int groupList);
}
