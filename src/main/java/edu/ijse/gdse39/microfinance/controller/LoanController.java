package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author Pahansith on 10/4/2017
 * @project MicroFinance
 */
@Controller
public class LoanController {

    @Autowired
    ProvinceService provinceService;

    @RequestMapping(value = "/newLoan")
    public ModelAndView  getLoanView(){
        List<ProvinceDto> provinceList = provinceService.getAllProvice();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/new-loan");
        mv.addObject("provinceList",provinceList);
        return mv;
    }

    @RequestMapping(value = "/loanAdd")
    public ModelAndView getLoanAddView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/add-newLoan");
        return mv;
    }

    @RequestMapping(value = "/branch-recommendation")
    public ModelAndView getBranchRecomView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/branch-recom");
        return mv;
    }

    @RequestMapping(value = "/issue-loan")
    public ModelAndView issueLoan(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/issue-loan");
        return mv;

    }

    @RequestMapping(value = "branch-search")
    public ModelAndView getBranchSearchView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/search-branchRecom");
        return mv;
    }

}
