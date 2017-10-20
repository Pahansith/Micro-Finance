package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.CustomerFeedbackDao;
import edu.ijse.gdse39.microfinance.model.CustomerFeedbackDataModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Pahansith on 10/19/2017
 * @project MicroFinance
 */
@Repository
public class CustomerFeedbackDaoImpl implements CustomerFeedbackDao {
    @Autowired
    SessionFactory sessionFactory;


    @Override
    public Serializable saveFeedback(CustomerFeedbackDataModel customerFeedbackDataModel) {
        Transaction txn = null;
        Session session = sessionFactory.openSession();
        try {
            txn = session.beginTransaction();
            Serializable save = session.save(customerFeedbackDataModel);
            txn.commit();
            return save;
        }catch (Exception e){
            e.printStackTrace();
            txn.rollback();
            return null;
        }finally {
            session.close();
        }

    }

    @Override
    public CustomerFeedbackDataModel getFeedbackDataOfCustomer(int memId) {
        Session session = sessionFactory.openSession();
        CustomerFeedbackDataModel customerFeedbackDataModel = null;
        Transaction txn = null;
        try {
            txn = session.beginTransaction();
            customerFeedbackDataModel = (CustomerFeedbackDataModel) session.get(CustomerFeedbackDataModel.class, memId);
            txn.commit();
            return customerFeedbackDataModel;
        }catch (Exception e){
            txn.rollback();
            e.printStackTrace();
            return customerFeedbackDataModel;
        }finally {
            session.close();
        }
    }
}
