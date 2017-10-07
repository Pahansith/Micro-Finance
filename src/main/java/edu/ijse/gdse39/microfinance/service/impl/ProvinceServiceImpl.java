package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.ProvinceDao;
import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */
@Service
@Transactional
public class ProvinceServiceImpl implements ProvinceService{

    @Autowired
    ProvinceDao provinceDao;

    @Override
    public List<ProvinceDto> getAllProvice() {
        List<ProvinceModel> provinceList = provinceDao.getProvinceList();
        List<ProvinceDto> provinceDtos = new ModelToDtoMapper().mapProvinceModelList(provinceList);
        return provinceDtos;
    }
}
