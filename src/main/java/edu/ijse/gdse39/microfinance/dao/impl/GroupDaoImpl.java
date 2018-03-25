package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.GroupDao;
import edu.ijse.gdse39.microfinance.model.GroupModel;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */
@Repository
public class GroupDaoImpl implements GroupDao {

    Transaction txn = null;

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<MemberModel> getMemberGroupDetails(int memberId) {
        Session session = sessionFactory.openSession();
        List<MemberModel> memberList = null;
        try {
            txn = session.beginTransaction();
            MemberModel m = (MemberModel) session.get(MemberModel.class, memberId);
            Integer groupId = m.getGroupModel().getGroupId();

            Query query = session.createQuery("select m from MemberModel m inner join m.groupModel g where g.groupId=:id");
            memberList = query.setParameter("id",groupId).list();
            txn.commit();
            return memberList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {

            session.close();
        }
    }

    @Override
    public List<GroupModel> getGroupBySociety(int societyId) {
        Session session = sessionFactory.openSession();
        List<GroupModel> groupModelList = null;
        try {
            txn = session.beginTransaction();
            Query query = session.createQuery("select g from GroupModel g inner join g.societyModel s where s.societyId=:id");
            groupModelList = query.setParameter("id",societyId).list();
            txn.commit();
            return groupModelList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {
            session.close();
        }
    }

    @Override
    public GroupModel searchSelectedGroup(int groupId) {
        Session session = sessionFactory.openSession();
        GroupModel groupModel = null;
        try {
            txn = session.beginTransaction();
            groupModel = (GroupModel) session.get(GroupModel.class,groupId);
            txn.commit();
            return groupModel;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return groupModel;
        }finally {
            session.close();
        }
    }
}
