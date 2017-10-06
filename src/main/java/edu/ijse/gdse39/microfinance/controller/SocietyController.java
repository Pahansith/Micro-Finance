package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pahansith on 10/6/2017
 * @project MicroFinance
 */

@Controller
public class SocietyController {
    @RequestMapping(value = "/add-society")
    public String getSocietyAddView(){
        return "admin/add-society";
    }

    @RequestMapping(value = "/societyList")
    public String getBranchListView(){
        return "admin/list-society";
    }
}
