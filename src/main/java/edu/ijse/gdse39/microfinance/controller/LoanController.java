package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 10/4/2017
 * @project MicroFinance
 */
@Controller
public class LoanController {

    @RequestMapping(value = "/newLoan")
    public String  getLoanView(){
        return "new-loan";
    }

    @RequestMapping(value = "/loanAdd")
    public ModelAndView getLoanAddView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add-newLoan");
        return mv;
    }

    @RequestMapping(value = "/branch-recommendation")
    public ModelAndView getBranchRecomView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("branch-recom");
        return mv;
    }

    @RequestMapping(value = "/issue-loan")
    public ModelAndView issueLoan(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("issue-loan");
        return mv;

    }

}
