package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pahansith on 10/6/2017
 * @project MicroFinance
 */
@Controller
public class BranchController {

    @RequestMapping(value = "/add-branch")
    public String addBranchView(){
        return "admin/add-branch";
    }

    @RequestMapping(value = "/branchList")
    public String getBranchListView(){
        return "admin/list-branch";
    }
}
