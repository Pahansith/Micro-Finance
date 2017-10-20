package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */

public class CustomerFeedbackDataDto {
    private String loanHistory;
    private String customerProperties;
    private String customerBusiness;
    private Integer customerId;

    public CustomerFeedbackDataDto() {
    }

    public CustomerFeedbackDataDto(String loanHistory, String customerProperties, String customerBusiness, Integer customerId) {
        this.loanHistory = loanHistory;
        this.customerProperties = customerProperties;
        this.customerBusiness = customerBusiness;
        this.customerId = customerId;
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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
