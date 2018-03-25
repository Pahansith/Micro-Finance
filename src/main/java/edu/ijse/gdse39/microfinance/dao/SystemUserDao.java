package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.SystemUser;

/**
 * @author Pahansith on 3/25/2018
 * @project MicroFinance-master
 */

public interface SystemUserDao {
    boolean saveSystemUser(SystemUser systemUser) throws Exception;
}
