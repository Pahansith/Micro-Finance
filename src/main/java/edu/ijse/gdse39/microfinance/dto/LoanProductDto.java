package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */

public class LoanProductDto {
    int id;
    private String productName;
    private String defPeriod;
    private double defIntRate;
    private double minAmount;
    private double maxAmount;

    public LoanProductDto() {
    }

    public LoanProductDto(int id, String productName, String defPeriod, double defIntRate, double minAmount, double maxAmount) {
        this.id = id;
        this.productName = productName;
        this.defPeriod = defPeriod;
        this.defIntRate = defIntRate;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
