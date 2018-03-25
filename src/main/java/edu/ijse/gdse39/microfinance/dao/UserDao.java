package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;

import java.util.List;

/**
 * @author Pahansith on 10/18/2017
 * @project MicroFinance
 */

public interface UserDao {
    public SystemUser getSelectedSystemUser(Integer id);

    List<LoanModel> findLoanOfUser(Integer userAccountId) throws Exception;
}
