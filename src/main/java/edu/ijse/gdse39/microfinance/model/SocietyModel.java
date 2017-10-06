package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "society_mst")
public class SocietyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer societyId;
    String societyName;
    String presidentName;
    String secretaryName;
    @ManyToOne
    BranchModel branchModel;

    public SocietyModel() {
    }

    public SocietyModel(String societyName, String presidentName, String secretaryName, BranchModel branchModel) {
        this.societyName = societyName;
        this.presidentName = presidentName;
        this.secretaryName = secretaryName;
        this.branchModel = branchModel;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName;
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

    public BranchModel getBranchModel() {
        return branchModel;
    }

    public void setBranchModel(BranchModel branchModel) {
        this.branchModel = branchModel;
    }

}
