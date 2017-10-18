package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */

@Entity
@Table(name = "member_feedback_mst")
public class CustomerFeedbackDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    public CustomerFeedbackDataModel() {
    }

    private String loanHistory;
    private String customerProperties;
    private String customerBusiness;

    @OneToOne
    private MemberModel memberModel;

    public CustomerFeedbackDataModel(String loanHistory, String customerProperties, String customerBusiness, MemberModel memberModel) {
        this.loanHistory = loanHistory;
        this.customerProperties = customerProperties;
        this.customerBusiness = customerBusiness;
        this.memberModel = memberModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public MemberModel getMemberModel() {
        return memberModel;
    }

    public void setMemberModel(MemberModel memberModel) {
        this.memberModel = memberModel;
    }
}
