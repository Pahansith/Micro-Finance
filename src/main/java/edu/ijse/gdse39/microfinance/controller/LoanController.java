package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.*;
import edu.ijse.gdse39.microfinance.service.GroupService;
import edu.ijse.gdse39.microfinance.service.LoanService;
import edu.ijse.gdse39.microfinance.service.MemberService;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/4/2017
 * @project MicroFinance
 */
@Controller
public class LoanController {

    @Autowired
    LoanService loanService;

    @Autowired
    GroupService groupService;

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/loanAddView")
    public ModelAndView getLoanAddView(@RequestParam(name = "mem-id")String memberId){
        ModelAndView mv = new ModelAndView();
        /*int memId = 0;
        try {
            memId = Integer.parseInt(memberId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        ArrayList<LoanDto> customerPreviousLoanList = loanService.getCustomerPreviousLoanList(memId);
        MemberDto selectedMember = memberService.getSelectedMember(memId);

        ArrayList<MemberDto> memberGroupDetails = groupService.getMemberGroupDetails(memId);
        ArrayList<LoanProductDto> loanProductList = loanService.getLoanProductList();

        mv.addObject("memberGroupDetails",memberGroupDetails);
        mv.addObject("loanProductList",loanProductList);
        mv.addObject("selectedMember",selectedMember);
        mv.addObject("customerLoanList",customerPreviousLoanList)*/;

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

    @RequestMapping(value = "/submitNewLoan" , method = RequestMethod.POST, consumes = {"application/json"})
    public @ResponseBody String submitLoanRecords(@RequestBody LoanAddInfoDto loanInfo){
        System.out.println(loanInfo.getLoanAmount());
        return "success";
    }



}
