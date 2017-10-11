package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.GroupDao;
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
            return memberList;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {
            txn.commit();
            session.close();
        }
    }
}
