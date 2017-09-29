package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "loan_mst")
public class LoanModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer loanId;
    int loanNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    MemberModel memberModel;
    Integer guarentor1;
    Integer guarentor2;
    double approvedLoanAmount;
    int periodInMonths;
    double intRate;
    String intRateStr;
    @OneToOne
    SystemUser approvedUser;
    @ManyToOne(cascade = CascadeType.ALL)
    LoanProductModel loanProductModel;

    public LoanModel() {
    }

    public LoanModel(int loanNumber, MemberModel memberModel, Integer guarentor1, Integer guarentor2, double approvedLoanAmount, int periodInMonths, double intRate, String intRateStr, SystemUser approvedUser, LoanProductModel loanProductModel) {
        this.loanNumber = loanNumber;
        this.memberModel = memberModel;
        this.guarentor1 = guarentor1;
        this.guarentor2 = guarentor2;
        this.approvedLoanAmount = approvedLoanAmount;
        this.periodInMonths = periodInMonths;
        this.intRate = intRate;
        this.intRateStr = intRateStr;
        this.approvedUser = approvedUser;
        this.loanProductModel = loanProductModel;
    }



    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public MemberModel getMemberModel() {
        return memberModel;
    }

    public void setMemberModel(MemberModel memberModel) {
        this.memberModel = memberModel;
    }

    public Integer getGuarentor1() {
        return guarentor1;
    }

    public void setGuarentor1(Integer guarentor1) {
        this.guarentor1 = guarentor1;
    }

    public Integer getGuarentor2() {
        return guarentor2;
    }

    public void setGuarentor2(Integer guarentor2) {
        this.guarentor2 = guarentor2;
    }

    public double getApprovedLoanAmount() {
        return approvedLoanAmount;
    }

    public void setApprovedLoanAmount(double approvedLoanAmount) {
        this.approvedLoanAmount = approvedLoanAmount;
    }

    public int getPeriodInMonths() {
        return periodInMonths;
    }

    public void setPeriodInMonths(int periodInMonths) {
        this.periodInMonths = periodInMonths;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public String getIntRateStr() {
        return intRateStr;
    }

    public void setIntRateStr(String intRateStr) {
        this.intRateStr = intRateStr;
    }

    public SystemUser getApprovedUser() {
        return approvedUser;
    }

    public void setApprovedUser(SystemUser approvedUser) {
        this.approvedUser = approvedUser;
    }

    public LoanProductModel getLoanProductModel() {
        return loanProductModel;
    }

    public void setLoanProductModel(LoanProductModel loanProductModel) {
        this.loanProductModel = loanProductModel;
    }

}
