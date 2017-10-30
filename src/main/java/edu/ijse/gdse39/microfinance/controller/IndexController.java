package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pahansith on 10/3/2017
 * @project MicroFinance
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String mapIndexFile(){
        return "index";
    }

    @RequestMapping(value = "/index")
    public String mapIndexFile2(){
        return "index";
    }

    @RequestMapping(value = "/register")
    public String mapRegisterView(){
        return "register";
    }

}
