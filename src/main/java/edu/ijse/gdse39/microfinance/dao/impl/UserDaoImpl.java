package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.UserDao;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
