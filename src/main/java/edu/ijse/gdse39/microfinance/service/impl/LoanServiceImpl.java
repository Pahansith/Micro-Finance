package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.LoanDao;
import edu.ijse.gdse39.microfinance.dto.LoanDto;
import edu.ijse.gdse39.microfinance.dto.LoanProductDto;
import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.LoanProductModel;
import edu.ijse.gdse39.microfinance.service.LoanService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanDao loanDao;

    @Override
    public ArrayList<LoanDto> getCustomerPreviousLoanList(int customerId) {
        List<LoanModel> customerPreviousLoanList = loanDao.getCustomerPreviousLoanList(customerId);
        return new ModelToDtoMapper().mapLoanModelList(customerPreviousLoanList);
    }

    @Override
    public ArrayList<LoanProductDto> getLoanProductList() {
        List<LoanProductModel> modelList = loanDao.getLoanProductList();
        return new ModelToDtoMapper().mapLoanProductList(modelList);
    }
}
