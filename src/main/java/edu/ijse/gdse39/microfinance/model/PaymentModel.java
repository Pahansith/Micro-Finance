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
    @ManyToOne(cascade = CascadeType.ALL)
    LoanModel loanModel;
    String paymentDate;
    double paymentAmount;

}
