package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "loan_product_mst")
public class LoanProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String productName;
    String defPeriod;
    double defIntRate;
    double minAmount;
    double maxAmount;

}
