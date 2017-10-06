package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dao.impl.MemberDaoImpl;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.impl.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 10/6/2017
 * @project MicroFinance
 */
@Controller
public class TestController {

    @Autowired
    MemberServiceImpl msi;

    @RequestMapping(value = "/test-add",method = RequestMethod.POST)
    public @ResponseBody String testHb(){
        int i = msi.testConn(new ProvinceModel(1,"Western"));
        if (i>0){
            return "Done !";
        }
        return "Fucked Up!!!";

    }
}
