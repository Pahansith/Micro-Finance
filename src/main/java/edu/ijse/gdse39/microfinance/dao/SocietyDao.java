package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.model.SocietyModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public interface SocietyDao {
    List<SocietyModel> getSocietyByBranch(int branchId);
}
