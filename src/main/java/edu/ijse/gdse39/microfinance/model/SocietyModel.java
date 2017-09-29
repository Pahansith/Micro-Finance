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
    @ManyToOne(cascade = CascadeType.ALL)
    BranchModel branchModel;

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

    public SocietyModel(String societyName, BranchModel branchModel) {
        this.societyName = societyName;
        this.branchModel = branchModel;
    }
}
