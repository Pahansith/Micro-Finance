package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.SocietyModel;

import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public interface SocietyDao {
    List<SocietyModel> getSocietyByBranch(int branchId);

    boolean save(SocietyModel societyModel) throws Exception;
}
