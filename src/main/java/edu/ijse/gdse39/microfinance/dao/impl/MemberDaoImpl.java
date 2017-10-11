package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.io.Serializable;
import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Repository
public class MemberDaoImpl implements MemberDao{

    @Autowired
    SessionFactory sessionFactory;

    public int saveProvince(ProvinceModel p){
        Serializable save = sessionFactory.getCurrentSession().save(p);
        if (save!=null){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public List<MemberModel> getMemberListForNewLoan(int societyId) {
        List<MemberModel> memberList = null;
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query query = session.createQuery("select m from MemberModel m inner join m.groupModel g inner join g.societyModel s where s.societyId =:id");
            query.setParameter("id",societyId);
            memberList = query.list();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return memberList;
    }

    @Override
    public MemberModel getSelectedMember(int memId) {
        MemberModel member = null;
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            member = (MemberModel) session.get(MemberModel.class, memId);
            return member;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return member;
        } finally {
            transaction.commit();
            session.close();
        }


    }
}
