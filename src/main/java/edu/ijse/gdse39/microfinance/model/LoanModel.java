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

}
