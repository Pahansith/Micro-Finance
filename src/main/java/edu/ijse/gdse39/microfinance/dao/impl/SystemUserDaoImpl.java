package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.SystemUserDao;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Pahansith on 3/25/2018
 * @project MicroFinance-master
 */

@Repository
public class SystemUserDaoImpl implements SystemUserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveSystemUser(SystemUser systemUser) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            session.save(systemUser);
            txn.commit();
            return true;
        } finally {
            session.flush();
            session.close();
        }
    }
}
