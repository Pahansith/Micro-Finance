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
    Integer id;
    Integer sequenceNumber;
    double amountTotal;
    double rentalCapital;
    double rentalInterest;
    String dueDate;
    double paidTotal;
    double paidCapital;
    double paidInterest;
    String paidDate;
    @ManyToOne(cascade = CascadeType.ALL)
    LoanModel loanModel;
}
