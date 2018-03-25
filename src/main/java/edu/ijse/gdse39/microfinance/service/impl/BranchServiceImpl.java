package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.BranchDao;
import edu.ijse.gdse39.microfinance.dao.ProvinceDao;
import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.model.BranchModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.BranchService;
import edu.ijse.gdse39.microfinance.service.mapper.DtoToModelMapper;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

@Service
@Transactional
public class BranchServiceImpl implements BranchService {


    @Autowired
    BranchDao branchDao;

    @Autowired
    ProvinceDao provinceDao;

    @Override
    public ArrayList<BranchDto> getBranchByProvince(int provinceId) {
        List<BranchModel> branchListByProvince = branchDao.getBranchListByProvince(provinceId);
        return new ModelToDtoMapper().mapBranchModelList(branchListByProvince);
    }

    @Override
    public List<BranchDto> findAllBranches() throws Exception {
        List<BranchModel> branchModelList = branchDao.findAll();
        ArrayList<BranchDto> branchDtos = new ModelToDtoMapper().mapBranchModelList(branchModelList);
        return branchDtos;
    }

    @Override
    public boolean addNewBranch(BranchDto branchDto) throws Exception {
        BranchModel branchModel = new DtoToModelMapper().mapBranchDto(branchDto);
        ProvinceModel provinceModel = provinceDao.findProvince(Integer.parseInt(branchDto.getProvinceId()));
        branchModel.setProvinceModel(provinceModel);
        return branchDao.save(branchModel);
    }
}
