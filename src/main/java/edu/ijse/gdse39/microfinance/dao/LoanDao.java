package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.LoanProductModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

public interface LoanDao {
    List<LoanModel> getCustomerPreviousLoanList(int customerId);

    List<LoanProductModel> getLoanProductList();

    Serializable saveNewLoan(LoanModel loanModel);

    LoanModel getCustomerLoanDetailsForApproval(Integer memberId);

    boolean approveLoan(LoanModel loanModel);

    LoanModel getApproveLoanModelOfCustomer(Integer id);
}
