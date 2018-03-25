package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.dto.GroupDto;
import edu.ijse.gdse39.microfinance.dto.SocietyDto;
import edu.ijse.gdse39.microfinance.service.BranchService;
import edu.ijse.gdse39.microfinance.service.GroupService;
import edu.ijse.gdse39.microfinance.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Autowired
    BranchService branchService;

    @RequestMapping(value = "/add-society")
    public ModelAndView getSocietyAddView() {
        ModelAndView mv = new ModelAndView();
        try {
            List<BranchDto> branchDtoList = branchService.findAllBranches();
            mv.setViewName("admin/add-society");
            mv.addObject("branchList", branchDtoList);
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("error");
        }
        return mv;
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

    @RequestMapping(value = "/save-society", method = RequestMethod.POST)
    public ModelAndView saveSociety(@RequestParam Map<String, String> map, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView();
        String branchId = map.get("branchId");
        String name = map.get("name");
        String president = map.get("president");
        String secretory = map.get("secretory");
        SocietyDto societyDto = new SocietyDto(name, president, secretory, branchId);
        try {
            boolean isAdded = societyService.addNewSociety(societyDto);
            modelAndView.setViewName("redirect:/add-society");
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
        }
        return modelAndView;
    }
}
