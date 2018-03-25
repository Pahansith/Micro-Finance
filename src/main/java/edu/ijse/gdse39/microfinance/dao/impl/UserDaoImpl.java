package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.UserDao;
import edu.ijse.gdse39.microfinance.model.LoanModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pahansith on 10/18/2017
 * @project MicroFinance
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public SystemUser getSelectedSystemUser(Integer id) {
        SystemUser systemUser = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            systemUser = (SystemUser) session.get(SystemUser.class, id);
            txn.commit();
            return systemUser;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return systemUser;
        }finally {
            session.close();
        }
    }

    @Override
    public List<LoanModel> findLoanOfUser(Integer userAccountId) throws Exception {
        List<LoanModel> memberLoan = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("select l from LoanModel l inner join l.memberModel m inner join m.systemUser u where u.id =:id");
            query.setParameter("id", userAccountId);
            memberLoan = query.list();
            return memberLoan;
        } finally {
            txn.commit();
            session.close();
        }
    }
}
