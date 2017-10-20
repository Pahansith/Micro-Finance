package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.LoanScheduleDao;
import edu.ijse.gdse39.microfinance.dto.LoanScheduleDto;
import edu.ijse.gdse39.microfinance.model.LoanScheduleModel;
import edu.ijse.gdse39.microfinance.service.LoanScheduleService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/20/2017
 * @project MicroFinance
 */

@Service
public class LoanScheduleServiceImpl implements LoanScheduleService {
    @Autowired
    LoanScheduleDao loanScheduleDao;

    @Override
    public ArrayList<LoanScheduleDto> getLoanScheduleForSpecificLoan(int loanNumber) {
        List<LoanScheduleModel> loanScheduleModelList = loanScheduleDao.getLoanScheduleForSpecificLoan(loanNumber);
        return new ModelToDtoMapper().mapLoanScheduleModelList(loanScheduleModelList);
    }
}
