package edu.ijse.gdse39.microfinance.dao.impl;

import edu.ijse.gdse39.microfinance.dao.ProvinceDao;
import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/7/2017
 * @project MicroFinance
 */

@Repository
public class ProvinceDaoImpl implements ProvinceDao {
    @Autowired
    SessionFactory sessionFactory;

    List<ProvinceModel> provinceList = null;
    @Override
    public List<ProvinceModel> getProvinceList() {
        Session session = sessionFactory.openSession();
        try{
            session.beginTransaction();
            provinceList = session.createQuery("from ProvinceModel").list();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.flush();
            session.close();
        }
        return provinceList;
    }
}
