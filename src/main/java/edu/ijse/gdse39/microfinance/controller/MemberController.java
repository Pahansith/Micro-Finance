package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.*;
import edu.ijse.gdse39.microfinance.exception.UserNotFoundException;
import edu.ijse.gdse39.microfinance.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */


@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    BranchService branchService;

    @Autowired
    ProvinceService provinceService;

    @Autowired
    GroupService groupService;

    @Autowired
    SocietyService societyService;

    @Autowired
    AccountCreateService accountCreateService;

    @Autowired
    LoanService loanService;


    @RequestMapping(value = "/member-add")
    public ModelAndView addNewMemberView(){
        ModelAndView mv = new ModelAndView();
        List<ProvinceDto> allProvice = provinceService.getAllProvice();
        mv.addObject("provinceList",allProvice);
        mv.setViewName("admin/add-member");
        return mv;
    }

    @RequestMapping(value = "/update-member")
    public String getMemberUpdateView(){
        return "admin/edit-member";
    }

    @RequestMapping(value = "/getLoanMemberList")
    public @ResponseBody String getMembersForNewLoan(@RequestParam(name = "societyId") String societyId){
        ArrayList<MemberDto> memberListForLoan = memberService.getMemberListForLoan(Integer.parseInt(societyId));
        Gson gson = new Gson();
        return gson.toJson(memberListForLoan);
    }

    @RequestMapping(value = "/getLoanMemberListForBranchRecom",method = RequestMethod.POST)
    public @ResponseBody String getLoanMemberListForBranchRecom(@RequestParam(name = "societyId")String societyId){
        ArrayList<MemberDto> memberListForLoan = memberService.getPendingApproveLoanList(Integer.parseInt(societyId));
        Gson gson = new Gson();
        return gson.toJson(memberListForLoan);
    }

    @RequestMapping(value = "/saveNewCustomer",method = RequestMethod.POST)
    public ModelAndView saveNewCustomer(@RequestParam Map<String,String> requestParams){
        boolean isSaved = memberService.saveMember(requestParams);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/add-member");
        return mv;
    }

    @RequestMapping(value = "/approve-member")
    public ModelAndView approveMemberView() {
        ModelAndView mv = new ModelAndView();
        List<AccountCreateDto> accountList = null;
        try {
            accountList = accountCreateService.findAllPendingAccounts();
        } catch (Exception e) {
            mv.setViewName("error");
            return mv;
        }

        mv.addObject("approveMemberList", accountList);
        mv.setViewName("admin/approve-member-login");
        return mv;
    }

    @RequestMapping(value = "/approve", method = RequestMethod.POST)
    public ModelAndView approveMember(@RequestParam(name = "memberId") String memberId) {
        ModelAndView mv = new ModelAndView();
        try {
            boolean isAuthorized = accountCreateService.authorizeMember(memberId);
            mv.setViewName("redirect:/admin-home");
        } catch (Exception e) {
            if (e instanceof UserNotFoundException) {
                mv.setViewName("redirect:/user-notfound");
                return mv;
            }
            mv.setViewName("redirect:/error");
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping(value = "/applicant")
    public ModelAndView getMemberLoan(HttpServletRequest request) {
        HttpSession session = request.getSession();
        LoginInfoDto loginInfoDto = (LoginInfoDto) session.getAttribute("loginInfoDto");
        ModelAndView mv = new ModelAndView();
        try {
            List<LoanDto> memberLoanDetails = loanService.getMemberLoanDetails(loginInfoDto.getId());
            mv.setViewName("customer/applicant");
            mv.addObject("memberLoanList", memberLoanDetails);
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("error");
        }

        return mv;
    }
}
