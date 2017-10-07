package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */

public class ProvinceDto {
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

    public ProvinceDto(Integer provinceId, String provinceName) {
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }
}
