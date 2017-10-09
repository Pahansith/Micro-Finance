package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public class SocietyDto {

    private Integer societyId;
    private String societyName;

    public SocietyDto() {
    }

    public SocietyDto(Integer societyId, String societyName) {
        this.societyId = societyId;
        this.societyName = societyName;
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
}
