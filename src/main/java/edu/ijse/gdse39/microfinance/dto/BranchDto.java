package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public class BranchDto {

    private Integer branchId;
    private String name;

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



    public BranchDto() {
    }

    public BranchDto(Integer branchId, String name) {
        this.branchId = branchId;
        this.name = name;
    }
}
