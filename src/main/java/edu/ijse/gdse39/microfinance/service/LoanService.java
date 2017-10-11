package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.LoanDto;
import edu.ijse.gdse39.microfinance.dto.LoanProductDto;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

public interface LoanService {
    ArrayList<LoanDto> getCustomerPreviousLoanList(int customerId);

    ArrayList<LoanProductDto> getLoanProductList();
}
