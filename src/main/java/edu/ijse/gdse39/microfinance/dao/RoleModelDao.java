package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.RoleModel;

/**
 * @author Pahansith on 3/25/2018
 * @project MicroFinance-master
 */

public interface RoleModelDao {
    boolean saveRoleModel(RoleModel roleModel) throws Exception;

    RoleModel findRoleModel(RoleModel.ROLE_TYPE customer) throws Exception;
}
