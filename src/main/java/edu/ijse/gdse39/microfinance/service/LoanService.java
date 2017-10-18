package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.LoanAddInfoDto;
import edu.ijse.gdse39.microfinance.dto.LoanDto;
import edu.ijse.gdse39.microfinance.dto.LoanProductDto;
import edu.ijse.gdse39.microfinance.dto.MemberDto;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

public interface LoanService {
    ArrayList<LoanDto> getCustomerPreviousLoanList(int customerId);

    ArrayList<LoanProductDto> getLoanProductList();

    boolean saveNewLoan(LoanAddInfoDto loanAddInfoDto, ArrayList<MemberDto> guarentorList,MemberDto selectedMember,ArrayList<LoanProductDto> loanProductList);
}
