package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.UserAccountDao;
import edu.ijse.gdse39.microfinance.model.RoleModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Pahansith on 10/21/2017
 * @project MicroFinance
 */

@Repository
public class UserAccountDaoImpl implements UserAccountDao {

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public SystemUser getUser(String userName, String password) throws Exception {
        Session session = sessionFactory.openSession();
        SystemUser user = null;
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            Criteria criteria = session.createCriteria(SystemUser.class).add(Restrictions.eq("name", userName)).add(Restrictions.eq("password",password));
            user = (SystemUser) criteria.uniqueResult();
            txn.commit();
            return user;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return user;
        }finally {
            session.close();
        }
    }

    @Override
    public RoleModel getUserRole(Integer roleId) {
        Session session = sessionFactory.openSession();
        RoleModel role = null;
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            Criteria cr = session.createCriteria(RoleModel.class).add(Restrictions.eq("id", roleId));
            role = (RoleModel) cr.uniqueResult();
            txn.commit();
            return role;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return role;
        }finally {
            session.close();
        }
    }
}
