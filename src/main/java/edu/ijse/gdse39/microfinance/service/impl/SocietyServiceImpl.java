package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.SocietyDao;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.model.SocietyModel;
import edu.ijse.gdse39.microfinance.service.SocietyService;
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
public class SocietyServiceImpl implements SocietyService {

    @Autowired
    SocietyDao societyDao;
    @Override
    public ArrayList<SocietyDto> getSocietyByBranch(int branchId) {
        List<SocietyModel> societyByBranch = societyDao.getSocietyByBranch(branchId);
        return new ModelToDtoMapper().mapSocietyModelList(societyByBranch);
    }
}
