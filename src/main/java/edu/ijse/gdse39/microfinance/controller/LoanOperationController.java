package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.LoanScheduleDto;
import edu.ijse.gdse39.microfinance.service.LoanScheduleService;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/5/2017
 * @project MicroFinance
 */

@Controller
public class LoanOperationController {

    @Autowired
    ProvinceService provinceService;

    @Autowired
    LoanScheduleService loanScheduleService;

    @RequestMapping(value = "loan-payment")
    public ModelAndView loanPayment(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/loan-payment");
        return mv;
    }

    @RequestMapping(value = "loan-scedule")
    public ModelAndView loanSchedule(){
        ModelAndView mv = new ModelAndView();
        /*List<ProvinceDto> provinceList = provinceService.getAllProvice();
        mv.addObject("provinceList",provinceList);*/
        mv.setViewName("admin/loan-schedule");
        return mv;
    }

    @RequestMapping(value = "/getLoanScheduleList")
    public @ResponseBody String getLoanScheduleList(@RequestParam String loanNumber){
        ArrayList<LoanScheduleDto> loanScheduleList = loanScheduleService.getLoanScheduleForSpecificLoan(Integer.parseInt(loanNumber));
        Gson gson = new Gson();
        return gson.toJson(loanScheduleList);
    }

}
