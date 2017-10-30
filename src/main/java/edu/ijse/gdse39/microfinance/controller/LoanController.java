package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.*;
import edu.ijse.gdse39.microfinance.service.GroupService;
import edu.ijse.gdse39.microfinance.service.LoanService;
import edu.ijse.gdse39.microfinance.service.MemberService;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @Autowired
    ProvinceService provinceService;


    @RequestMapping(value = "/newLoan")
    public ModelAndView getLoanView(){
        List<ProvinceDto> provinceList = provinceService.getAllProvice();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/new-loan");
        mv.addObject("provinceList",provinceList);
        return mv;
    }
    @RequestMapping(value = "/loanAddView")
    public ModelAndView getLoanAddView(@RequestParam(name = "mem-id")String memberId, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        int memId = Integer.parseInt(memberId);

        ArrayList<LoanDto> customerPreviousLoanList = loanService.getCustomerPreviousLoanList(memId);
        MemberDto selectedMember = memberService.getSelectedMember(memId);
        ArrayList<MemberDto> memberGroupDetails = groupService.getMemberGroupDetails(memId);
        ArrayList<LoanProductDto> loanProductList = loanService.getLoanProductList();

        HttpSession session = request.getSession();
        session.setAttribute("memberGroupDetails",memberGroupDetails);
        session.setAttribute("loanProductList",loanProductList);
        session.setAttribute("selectedMember",selectedMember);
        session.setAttribute("customerLoanList",customerPreviousLoanList);

        mv.setViewName("admin/add-newLoan");
        return mv;
    }

    @RequestMapping(value = "/branch-recommendation")
    public ModelAndView getBranchRecomView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/branch-recom");
        return mv;
    }

    @RequestMapping(value = "branch-search")
    public ModelAndView getBranchSearchView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/search-branchRecom");
        List<ProvinceDto> provinceList = provinceService.getAllProvice();
        mv.addObject("provinceList",provinceList);
        return mv;
    }

    @RequestMapping(value = "/submitNewLoan" , method = RequestMethod.POST, consumes = {"application/json"})
    public @ResponseBody String submitLoanRecords(@RequestBody LoanAddInfoDto loanInfo, HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer loggedInUserId = (Integer) session.getAttribute("loggedInUserId");
        MemberDto selectedMember = (MemberDto) session.getAttribute("selectedMember");
        ArrayList<MemberDto> memberGroupDetails = (ArrayList<MemberDto>) session.getAttribute("memberGroupDetails");
        ArrayList<LoanProductDto> loanProductList = (ArrayList<LoanProductDto>) session.getAttribute("loanProductList");
        loanInfo.setLoggedInUserId(loggedInUserId);
        String result = loanService.saveNewLoan(loanInfo, memberGroupDetails, selectedMember, loanProductList);
        return result;
    }

    @RequestMapping(value = "/loanApproveView",method = RequestMethod.POST)
    public ModelAndView getLoanApproveView(@RequestParam(name = "mem-id")String memberId, HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        int memId = Integer.parseInt(memberId);
        HttpSession session = request.getSession();

/*
        ArrayList<MemberDto> memberGroupDetails = groupService.getMemberGroupDetails(memId);
        ArrayList<LoanProductDto> loanProductList = loanService.getLoanProductList();


        session.setAttribute("memberGroupDetails",memberGroupDetails);
        session.setAttribute("loanProductList",loanProductList);
        session.setAttribute("selectedMember",selectedMember);*/

        CustomerFeedbackDataDto customerFeedback = loanService.getCustomerFeedback(memId);
        LoanDto customerLoanDetail = loanService.getCustomerLoanDetailsForApproval(Integer.parseInt(memberId));
        MemberDto selectedMember = memberService.getSelectedMember(memId);

        session.setAttribute("selectedMember",selectedMember);
        session.setAttribute("customerFeedback",customerFeedback);
        session.setAttribute("customerLoanDetail",customerLoanDetail);
        mv.setViewName("admin/branch-recom");
        return mv;
    }

    @RequestMapping(value = "approveLoan")
    public @ResponseBody String approveLoan(HttpServletRequest request){
        HttpSession session = request.getSession();
        MemberDto selectedMember = (MemberDto) session.getAttribute("selectedMember");
        LoanDto customerLoanDetail = (LoanDto)session.getAttribute("customerLoanDetail");
        boolean isSaved = loanService.approveLoan(selectedMember,customerLoanDetail);
        if (isSaved){
            return "Success";
        }
        return "Error Occurred";
    }



}
