package edu.ijse.gdse39.microfinance.service.mapper;

import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */

public class ModelToDtoMapper {
    public List<ProvinceDto> mapProvinceModelList(List<ProvinceModel> modelList){
        ArrayList<ProvinceDto> dtoList = new ArrayList<>();
        for (ProvinceModel provinceModel:
             modelList) {
            ProvinceDto provinceDto = new ProvinceDto(provinceModel.getProvinceId(),provinceModel.getProvinceName());
            dtoList.add(provinceDto);
        }

        return dtoList;
    }
}
