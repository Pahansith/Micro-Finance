package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */

public class LoanAddInfoDto {
    private String loanHistory;
    private String customerProperties;
    private String customerBusiness;
    private int loanProductId;
    private double loanAmount;
    private int loggedInUserId;


    public LoanAddInfoDto() {
    }

    public LoanAddInfoDto(String loanHistory, String customerProperties, String customerBusiness, int loanProductId, double loanAmount) {
        this.loanHistory = loanHistory;
        this.customerProperties = customerProperties;
        this.customerBusiness = customerBusiness;
        this.loanProductId = loanProductId;
        this.loanAmount = loanAmount;
    }

    public int getLoggedInUserId() {
        return loggedInUserId;
    }

    public void setLoggedInUserId(int loggedInUserId) {
        this.loggedInUserId = loggedInUserId;
    }

    public String getLoanHistory() {
        return loanHistory;
    }

    public void setLoanHistory(String loanHistory) {
        this.loanHistory = loanHistory;
    }

    public String getCustomerProperties() {
        return customerProperties;
    }

    public void setCustomerProperties(String customerProperties) {
        this.customerProperties = customerProperties;
    }

    public String getCustomerBusiness() {
        return customerBusiness;
    }

    public void setCustomerBusiness(String customerBusiness) {
        this.customerBusiness = customerBusiness;
    }

    public int getLoanProductId() {
        return loanProductId;
    }

    public void setLoanProductId(int loanProductId) {
        this.loanProductId = loanProductId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

}
