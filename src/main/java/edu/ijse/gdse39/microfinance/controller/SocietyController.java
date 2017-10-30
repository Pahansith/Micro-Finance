package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.GroupDto;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.service.GroupService;
import edu.ijse.gdse39.microfinance.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/6/2017
 * @project MicroFinance
 */

@Controller
public class SocietyController {

    @Autowired
    SocietyService societyService;

    @Autowired
    GroupService groupService;

    @RequestMapping(value = "/add-society")
    public String getSocietyAddView(){
        return "admin/add-society";
    }

    @RequestMapping(value = "/societyList")
    public String getBranchListView(){
        return "admin/list-society";
    }

    @RequestMapping(value = "/getSelectedSociety")
    public @ResponseBody String getSocietiesOfBranch(@RequestParam(value = "branchId") String branchId){
        ArrayList<SocietyDto> societyByBranch = societyService.getSocietyByBranch(Integer.parseInt(branchId));
        Gson gson = new Gson();
        return gson.toJson(societyByBranch);
    }

    @RequestMapping(value = "/getSelectedGroup")
    public @ResponseBody String getSelectedGroup(@RequestParam(value = "socId") String societyId){
        ArrayList<GroupDto> groupList = groupService.getGroupBySociety(Integer.parseInt(societyId));
        Gson gson = new Gson();
        return gson.toJson(groupList);
    }
}
