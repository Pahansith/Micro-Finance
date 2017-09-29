package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "loan_schedule_mst")
public class LoanScheduleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private
    Integer id;
    private Integer sequenceNumber;
    private double amountTotal;
    private double rentalCapital;
    private double rentalInterest;
    private String dueDate;
    private double paidTotal;
    private double paidCapital;
    private double paidInterest;
    private String paidDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public double getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(double amountTotal) {
        this.amountTotal = amountTotal;
    }

    public double getRentalCapital() {
        return rentalCapital;
    }

    public void setRentalCapital(double rentalCapital) {
        this.rentalCapital = rentalCapital;
    }

    public double getRentalInterest() {
        return rentalInterest;
    }

    public void setRentalInterest(double rentalInterest) {
        this.rentalInterest = rentalInterest;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public double getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(double paidTotal) {
        this.paidTotal = paidTotal;
    }

    public double getPaidCapital() {
        return paidCapital;
    }

    public void setPaidCapital(double paidCapital) {
        this.paidCapital = paidCapital;
    }

    public double getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(double paidInterest) {
        this.paidInterest = paidInterest;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public LoanModel getLoanModel() {
        return loanModel;
    }

    public void setLoanModel(LoanModel loanModel) {
        this.loanModel = loanModel;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    private
    LoanModel loanModel;

    public LoanScheduleModel(Integer sequenceNumber, double amountTotal, double rentalCapital, double rentalInterest, String dueDate, double paidTotal, double paidCapital, double paidInterest, String paidDate, LoanModel loanModel) {
        this.sequenceNumber = sequenceNumber;
        this.amountTotal = amountTotal;
        this.rentalCapital = rentalCapital;
        this.rentalInterest = rentalInterest;
        this.dueDate = dueDate;
        this.paidTotal = paidTotal;
        this.paidCapital = paidCapital;
        this.paidInterest = paidInterest;
        this.paidDate = paidDate;
        this.loanModel = loanModel;
    }


    public LoanScheduleModel() {
    }
}
