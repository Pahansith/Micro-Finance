package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.BranchDao;
import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.model.BranchModel;
import edu.ijse.gdse39.microfinance.service.BranchService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

@Service
public class BranchServiceImpl implements BranchService {


    @Autowired
    BranchDao branchDao;
    @Override
    public ArrayList<BranchDto> getBranchByProvince(int provinceId) {
        List<BranchModel> branchListByProvince = branchDao.getBranchListByProvince(provinceId);
        return new ModelToDtoMapper().mapBranchModelList(branchListByProvince);
    }
}
