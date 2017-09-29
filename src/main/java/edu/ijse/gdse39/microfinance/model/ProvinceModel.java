package edu.ijse.gdse39.microfinance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "province_mst")
public class ProvinceModel {
    @Id
    Integer provinceId;
    String provinceName;
    
}
