package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.LoanScheduleDao;
import edu.ijse.gdse39.microfinance.model.LoanScheduleModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */
@Repository
public class LoanScheduleDaoImpl implements LoanScheduleDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveLoanSchedule(LoanScheduleModel loanSchedule) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try{
            txn = session.beginTransaction();
            Serializable save = session.save(loanSchedule);
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
    public List<LoanScheduleModel> getLoanScheduleForSpecificLoan(int loanNumber) {
        Session session = sessionFactory.openSession();
        List<LoanScheduleModel> loanScheduleModelList = null;
        Transaction txn = null;
        try{
            txn = session.beginTransaction();
            Query query = session.createQuery("select l from LoanScheduleModel l inner join l.loanModel lm where lm.loanNumber =:loanNumber");
            query.setParameter("loanNumber",loanNumber);
            loanScheduleModelList = query.list();
            txn.commit();
            return loanScheduleModelList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return loanScheduleModelList;
        }finally {
            session.close();
        }
    }
}
