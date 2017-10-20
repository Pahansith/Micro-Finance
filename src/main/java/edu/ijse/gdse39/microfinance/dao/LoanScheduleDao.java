package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.model.LoanScheduleModel;

import java.util.List;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */

public interface LoanScheduleDao {
    boolean saveLoanSchedule(LoanScheduleModel loanSchedule);

    List<LoanScheduleModel> getLoanScheduleForSpecificLoan(int loanNumber);
}
