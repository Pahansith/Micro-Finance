package edu.ijse.gdse39.microfinance.service.mapper;

import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.model.BranchModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.model.SocietyModel;

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

    public ArrayList<BranchDto> mapBranchModelList(List<BranchModel> modelList){
        ArrayList<BranchDto> dtoList = new ArrayList<>();
        for (BranchModel branchModel:
                modelList) {
            BranchDto branch = new BranchDto(branchModel.getBranchId(),branchModel.getName());
            dtoList.add(branch);
        }
        return dtoList;
    }

    public ArrayList<SocietyDto> mapSocietyModelList(List<SocietyModel> modelList){
        ArrayList<SocietyDto> dtoList = new ArrayList<>();
        for (SocietyModel society:
                modelList) {
            SocietyDto societyDto = new SocietyDto(society.getSocietyId(),society.getSocietyName());
            dtoList.add(societyDto);
        }
        return dtoList;
    }
}
