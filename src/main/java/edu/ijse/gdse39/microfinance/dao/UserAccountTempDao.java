package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.UserAccountTmp;

import java.util.List;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */

public interface UserAccountTempDao {
    boolean saveUserAccountTemp(UserAccountTmp userAccountTmp) throws Exception;

    List<UserAccountTmp> findAll() throws Exception;

    UserAccountTmp findSelected(long id) throws Exception;

    void deleteById(long id) throws Exception;
}
