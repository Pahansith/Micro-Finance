package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.impl.MemberDaoImpl;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberDaoImpl mdi;

    public int testConn(ProvinceModel p){
        return mdi.saveProvince(p);
    }
}
