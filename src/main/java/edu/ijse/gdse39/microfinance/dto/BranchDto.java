package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public class BranchDto {

    private Integer branchId;
    private String name;
    private String address;
    private String telephone;
    private String fax;
    private String provinceId;

    public BranchDto() {
    }

    public BranchDto(Integer branchId, String name) {
        this.branchId = branchId;
        this.name = name;
    }

    public BranchDto(String name, String address, String telephone, String fax, String provinceId) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.fax = fax;
        this.provinceId = provinceId;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
