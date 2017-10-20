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
    private Integer id;
    private String paidDate;
    private double paidTotal;
    @ManyToOne(fetch = FetchType.EAGER)
    private LoanModel loanModel;

    public LoanScheduleModel() {
    }

    public LoanScheduleModel(double paidTotal, String paidDate, LoanModel loanModel) {
        this.paidTotal = paidTotal;
        this.paidDate = paidDate;
        this.loanModel = loanModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(double paidTotal) {
        this.paidTotal = paidTotal;
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
}
