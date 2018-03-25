package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.BranchDao;
import edu.ijse.gdse39.microfinance.dao.SocietyDao;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.model.BranchModel;
import edu.ijse.gdse39.microfinance.model.SocietyModel;
import edu.ijse.gdse39.microfinance.service.SocietyService;
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
public class SocietyServiceImpl implements SocietyService {

    @Autowired
    SocietyDao societyDao;

    @Autowired
    BranchDao branchDao;
    @Override
    public ArrayList<SocietyDto> getSocietyByBranch(int branchId) {
        List<SocietyModel> societyByBranch = societyDao.getSocietyByBranch(branchId);
        return new ModelToDtoMapper().mapSocietyModelList(societyByBranch);
    }

    @Override
    public boolean addNewSociety(SocietyDto societyDto) throws Exception {
        SocietyModel societyModel = new DtoToModelMapper().mapSocietyDto(societyDto);
        BranchModel branchModel = branchDao.findBranch(Integer.parseInt(societyDto.getBranchId()));
        societyModel.setBranchModel(branchModel);
        return societyDao.save(societyModel);
    }
}
