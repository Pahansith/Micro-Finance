package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "payment_mst")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @ManyToOne
    LoanModel loanModel;
    String paymentDate;
    double paymentAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LoanModel getLoanModel() {
        return loanModel;
    }

    public void setLoanModel(LoanModel loanModel) {
        this.loanModel = loanModel;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public PaymentModel() {
    }

    public PaymentModel(LoanModel loanModel, String paymentDate, double paymentAmount) {
        this.loanModel = loanModel;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }
}
