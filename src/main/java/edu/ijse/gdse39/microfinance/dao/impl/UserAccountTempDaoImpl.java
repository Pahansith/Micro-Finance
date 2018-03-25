package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.UserAccountTempDao;
import edu.ijse.gdse39.microfinance.model.UserAccountTmp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */
@Repository
public class UserAccountTempDaoImpl implements UserAccountTempDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveUserAccountTemp(UserAccountTmp userAccountTmp) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            session.save(userAccountTmp);
            txn.commit();
            return true;
        } finally {
            session.close();
        }
    }

    @Override
    public List<UserAccountTmp> findAll() throws Exception {
        List<UserAccountTmp> userAccountTmpList = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("FROM UserAccountTmp");
            userAccountTmpList = query.list();
            return userAccountTmpList;
        } finally {
            txn.commit();
            session.close();
        }
    }

    @Override
    public UserAccountTmp findSelected(long id) throws Exception {
        UserAccountTmp userAccountTmp = null;
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            //Query query = session.createQuery("select m from LoanModel l inner join l.memberModel m inner join m.groupModel g inner join g.societyModel s where s.societyId =:id and l.loanStatus = 'SAVED'");
            userAccountTmp = (UserAccountTmp) session.get(UserAccountTmp.class, id);
            txn.commit();
            return userAccountTmp;

        } finally {
            session.flush();
            session.close();
        }

    }

    @Override
    public void deleteById(long id) throws Exception {
        UserAccountTmp userAccountTmp = null;
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            //Query query = session.createQuery("select m from LoanModel l inner join l.memberModel m inner join m.groupModel g inner join g.societyModel s where s.societyId =:id and l.loanStatus = 'SAVED'");
            userAccountTmp = (UserAccountTmp) session.load(UserAccountTmp.class, id);
            session.delete(userAccountTmp);
            txn.commit();
        } finally {
            session.flush();
            session.close();
        }
    }
}
