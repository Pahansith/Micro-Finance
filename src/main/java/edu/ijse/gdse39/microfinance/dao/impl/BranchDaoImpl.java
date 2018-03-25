package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.BranchDao;
import edu.ijse.gdse39.microfinance.model.BranchModel;
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
public class BranchDaoImpl implements BranchDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<BranchModel> getBranchListByProvince(int provinceId) {
        List<BranchModel> branchList = null;
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query query = session.createQuery("select b from BranchModel b inner join b.provinceModel p where p.provinceId =:id");
            query.setParameter("id",provinceId);
            branchList = query.list();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return branchList;
    }

    @Override
    public List<BranchModel> findAll() throws Exception {
        List<BranchModel> branchList = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM BranchModel");
            branchList = query.list();
        } finally {
            session.flush();
            session.close();
        }
        return branchList;
    }

    @Override
    public BranchModel findBranch(int i) throws Exception {
        BranchModel branch = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            branch = (BranchModel) session.get(BranchModel.class, i);
        } finally {
            session.flush();
            session.close();
        }
        return branch;
    }

    @Override
    public boolean save(BranchModel branchModel) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.saveOrUpdate(branchModel);
        } finally {
            session.flush();
            session.close();

        }
        return true;
    }
}
