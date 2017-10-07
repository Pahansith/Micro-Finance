package edu.ijse.gdse39.microfinance.dao;

import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */

public interface ProvinceDao {

    List<ProvinceModel> getProvinceList();

}
