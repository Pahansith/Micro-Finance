package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.LoanDao;
import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.LoanProductModel;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
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

    @Override
    public Serializable saveNewLoan(LoanModel loanModel) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            Serializable save = session.save(loanModel);
            txn.commit();
            return save;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public LoanModel getCustomerLoanDetailsForApproval(Integer memberModel_memberId) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        LoanModel loanModel = null;
        try{
            txn = session.beginTransaction();
            Criteria criteria = session.createCriteria(LoanModel.class).add(Restrictions.eq("memberModel.memberId",memberModel_memberId)).add(Restrictions.eq("loanStatus","SAVED"));
            loanModel = (LoanModel) criteria.uniqueResult();
            txn.commit();
            return loanModel;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return loanModel;
        }finally {
            session.close();
        }
    }

    @Override
    public boolean approveLoan(LoanModel loanModel) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            session.update(loanModel);
            txn.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return false;
        }finally {
            session.close();
        }
    }

    @Override
    public LoanModel getApproveLoanModelOfCustomer(Integer id) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        LoanModel loanModel = null;
        try{
            txn = session.beginTransaction();
            Criteria criteria = session.createCriteria(LoanModel.class).add(Restrictions.eq("loanStatus","SAVED")).add(Restrictions.eq("loanId",id));
            loanModel = (LoanModel) criteria.uniqueResult();
            txn.commit();
            return loanModel;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return loanModel;
        }finally {
            session.close();
        }
    }
}
