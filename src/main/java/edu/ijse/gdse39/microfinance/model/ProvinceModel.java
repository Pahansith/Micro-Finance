package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "province_mst")
public class ProvinceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer provinceId;
    String provinceName;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public ProvinceModel(Integer provinceId, String provinceName) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }
}
