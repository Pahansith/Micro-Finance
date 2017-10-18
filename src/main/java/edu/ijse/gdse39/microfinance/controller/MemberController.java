package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */


@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

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
}
