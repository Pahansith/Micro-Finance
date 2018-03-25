package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.SocietyDao;
import edu.ijse.gdse39.microfinance.model.SocietyModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */
@Repository
public class SocietyDaoImpl implements SocietyDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<SocietyModel> getSocietyByBranch(int branchId) {
        List<SocietyModel> societyList = null;
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query query = session.createQuery("select s from SocietyModel s inner join s.branchModel b where b.branchId =:id");
            query.setParameter("id",branchId);
            societyList = query.list();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return societyList;
    }

    @Override
    public boolean save(SocietyModel societyModel) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.saveOrUpdate(societyModel);
        } finally {
            session.flush();
            session.close();

        }
        return true;
    }
}
