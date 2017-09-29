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


}
