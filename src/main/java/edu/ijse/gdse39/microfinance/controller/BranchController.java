package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.service.BranchService;
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
public class BranchController {

    @Autowired
    BranchService branchService;

    @RequestMapping(value = "/add-branch")
    public String addBranchView(){
        return "admin/add-branch";
    }

    @RequestMapping(value = "/branchList")
    public String getBranchListView(){
        return "admin/list-branch";
    }

    @RequestMapping(value = "/getSelectedBranch")
    public @ResponseBody String getSelectedBranchList(@RequestParam(name = "provinceId") String provinceId){
        ArrayList<BranchDto> branchByProvince = branchService.getBranchByProvince(Integer.parseInt(provinceId));
        Gson gson = new Gson();
        String jsonSting = gson.toJson(branchByProvince);
        return jsonSting;
    }
}
