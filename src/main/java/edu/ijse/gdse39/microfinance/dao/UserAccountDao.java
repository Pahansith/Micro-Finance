package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.RoleModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;

/**
 * @author Pahansith on 10/21/2017
 * @project MicroFinance
 */

public interface UserAccountDao {
    public SystemUser getUser(String userName, String password) throws Exception;

    public RoleModel getUserRole(Integer roleId);
}
