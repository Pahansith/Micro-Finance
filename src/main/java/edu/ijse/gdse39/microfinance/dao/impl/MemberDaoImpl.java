package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.Serializable;

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
}
