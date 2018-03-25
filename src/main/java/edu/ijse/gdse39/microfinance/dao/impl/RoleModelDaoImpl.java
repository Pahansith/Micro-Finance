package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.RoleModelDao;
import edu.ijse.gdse39.microfinance.model.RoleModel;
import org.hibernate.Query;
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
public class RoleModelDaoImpl implements RoleModelDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public boolean saveRoleModel(RoleModel roleModel) throws Exception {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            session.save(roleModel);
            txn.commit();
            return true;
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public RoleModel findRoleModel(RoleModel.ROLE_TYPE type) throws Exception {
        RoleModel roleModel = null;
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("FROM RoleModel r WHERE r.role_type =:type");
            query.setParameter("type", type);
            roleModel = (RoleModel) query.uniqueResult();
            return roleModel;
        } finally {
            txn.commit();
            session.close();
        }
    }
}
