package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Repository
public class MemberDaoImpl implements MemberDao{

    @Autowired
    SessionFactory sessionFactory;

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

    @Override
    public List<MemberModel> getPendingApproveLoanList(int societyId) {
        List<MemberModel> memberList = null;
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            Query query = session.createQuery("select m from LoanModel l inner join l.memberModel m inner join m.groupModel g inner join g.societyModel s where s.societyId =:id and l.loanStatus = 'SAVED'");
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
    public boolean saveMember(MemberModel memberModel) {
        Session session = sessionFactory.openSession();
        Transaction txn = null;
        try{
            txn = session.beginTransaction();
            session.saveOrUpdate(memberModel);
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
    public MemberModel findByNic(String nic) throws Exception {
        MemberModel member = null;
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from MemberModel m where m.nic =:nic");
            query.setParameter("nic", nic);
            member = (MemberModel) query.uniqueResult();
            return member;
        } finally {
            session.flush();
            session.close();
        }
    }
}
