package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */


@Controller
public class MemberController {

    @RequestMapping(value = "/member-add")
    public ModelAndView addNewMemberView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/add-member");
        return mv;
    }

    @RequestMapping(value = "/update-member")
    public String getMemberUpdateView(){
        return "admin/edit-member";
    }
}
