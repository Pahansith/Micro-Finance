package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public class SocietyDto {

    private Integer societyId;
    private String societyName;
    private String president;
    private String secretary;
    private String branchId;

    public SocietyDto() {
    }

    public SocietyDto(Integer societyId, String societyName) {
        this.societyId = societyId;
        this.societyName = societyName;
    }

    public SocietyDto(String societyName, String president, String secretary, String branchId) {

        this.societyName = societyName;
        this.president = president;
        this.secretary = secretary;
        this.branchId = branchId;
    }

    public Integer getSocietyId() {
        return societyId;
    }

    public void setSocietyId(Integer societyId) {
        this.societyId = societyId;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
