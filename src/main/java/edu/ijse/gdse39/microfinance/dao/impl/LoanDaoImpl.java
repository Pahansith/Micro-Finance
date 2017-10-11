package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.LoanDao;
import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.LoanProductModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/10/2017
 * @project MicroFinance
 */

@Repository
public class LoanDaoImpl implements LoanDao{

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<LoanModel> getCustomerPreviousLoanList(int customerId) {
        List<LoanModel> memberLoanList = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("select l from LoanModel l inner join l.memberModel m where m.memberId =:id");
            query.setParameter("id",customerId);
            memberLoanList = query.list();
            return memberLoanList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return memberLoanList;
        }finally {
            txn.commit();
            session.close();
        }

    }

    @Override
    public List<LoanProductModel> getLoanProductList() {
        List<LoanProductModel> loanProdcutList = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("FROM LoanProductModel");
            loanProdcutList = query.list();
            return loanProdcutList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {
            txn.commit();
            session.close();
        }

    }
}
