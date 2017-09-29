package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */

@Entity
@Table(name = "branch_mst")
public class BranchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer branchId;
    String name;
    String address;
    String telephone;
    String faxNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    ProvinceModel provinceModel;

    public BranchModel() {
    }

    public BranchModel(String name, String address, String telephone, String faxNumber, ProvinceModel provinceModel) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.faxNumber = faxNumber;
        this.provinceModel = provinceModel;
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

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public ProvinceModel getProvinceModel() {
        return provinceModel;
    }

    public void setProvinceModel(ProvinceModel provinceModel) {
        this.provinceModel = provinceModel;
    }
}
