package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.SystemUser;

/**
 * @author Pahansith on 10/18/2017
 * @project MicroFinance
 */

public interface UserDao {
    public SystemUser getSelectedSystemUser(Integer id);
}
