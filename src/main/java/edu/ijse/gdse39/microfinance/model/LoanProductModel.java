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
    private
    Integer id;
    private String productName;
    private String defPeriod;
    private double defIntRate;
    private double minAmount;
    private double maxAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDefPeriod() {
        return defPeriod;
    }

    public void setDefPeriod(String defPeriod) {
        this.defPeriod = defPeriod;
    }

    public double getDefIntRate() {
        return defIntRate;
    }

    public void setDefIntRate(double defIntRate) {
        this.defIntRate = defIntRate;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public LoanProductModel() {
    }

    public LoanProductModel(String productName, String defPeriod, double defIntRate, double minAmount, double maxAmount) {
        this.productName = productName;
        this.defPeriod = defPeriod;
        this.defIntRate = defIntRate;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }
}
