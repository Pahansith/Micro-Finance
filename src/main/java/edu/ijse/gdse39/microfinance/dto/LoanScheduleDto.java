package edu.ijse.gdse39.microfinance.dto;


/**
 * @author Pahansith on 10/20/2017
 * @project MicroFinance
 */

public class LoanScheduleDto {
    private Integer id;
    private String paidDate;
    private double paidTotal;
    private int loanId;

    public LoanScheduleDto() {
    }

    public LoanScheduleDto(Integer id, String paidDate, double paidTotal, int loanId) {
        this.id = id;
        this.paidDate = paidDate;
        this.paidTotal = paidTotal;
        this.loanId = loanId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    public double getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(double paidTotal) {
        this.paidTotal = paidTotal;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
}
