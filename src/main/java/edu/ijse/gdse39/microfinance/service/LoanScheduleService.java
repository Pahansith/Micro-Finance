package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.LoanScheduleDto;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/20/2017
 * @project MicroFinance
 */

public interface LoanScheduleService {
    public ArrayList<LoanScheduleDto> getLoanScheduleForSpecificLoan(int loanNumber);
}
