package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

public class LoanDto {


    int loanId;
    int loanNumber;
    String productName;
    double amount;
    double interestRate;
    String defPeriod;
    String status;

    public LoanDto() {
    }

    public LoanDto(int loanId, int loanNumber, String productName, double amount, double interestRate, String status) {
        this.loanId = loanId;
        this.loanNumber = loanNumber;
        this.productName = productName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.status = status;
    }

    public LoanDto(int loanId, int loanNumber, String productName, double amount, double interestRate, String status, String defPeriod) {
        this.loanId = loanId;
        this.loanNumber = loanNumber;
        this.productName = productName;
        this.amount = amount;
        this.interestRate = interestRate;
        this.status = status;
        this.defPeriod = defPeriod;
    }

    public String getDefPeriod() {
        return defPeriod;
    }

    public void setDefPeriod(String defPeriod) {
        this.defPeriod = defPeriod;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
