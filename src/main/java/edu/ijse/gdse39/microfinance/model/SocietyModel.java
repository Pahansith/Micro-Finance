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
}
