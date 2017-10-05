package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 10/5/2017
 * @project MicroFinance
 */

@Controller
public class LoanOperationController {

    @RequestMapping(value = "loan-payment")
    public ModelAndView loanPayment(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/loan-payment");
        return mv;
    }

    @RequestMapping(value = "loan-scedule")
    public ModelAndView loanSchedule(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/loan-schedule");
        return mv;
    }
}
