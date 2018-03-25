package edu.ijse.gdse39.microfinance.controller;

import com.google.gson.Gson;
import edu.ijse.gdse39.microfinance.dto.BranchDto;
import edu.ijse.gdse39.microfinance.dto.ProvinceDto;
import edu.ijse.gdse39.microfinance.service.BranchService;
import edu.ijse.gdse39.microfinance.service.ProvinceService;
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
public class BranchController {

    @Autowired
    BranchService branchService;

    @Autowired
    ProvinceService provinceService;


    @RequestMapping(value = "/add-branch")
    public ModelAndView addBranchView() {
        ModelAndView modelAndView = new ModelAndView();
        List<ProvinceDto> allProvice = provinceService.getAllProvice();
        modelAndView.setViewName("admin/add-branch");
        modelAndView.addObject("provinceList", allProvice);
        return modelAndView;
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

    @RequestMapping(value = "/save-branch", method = RequestMethod.POST)
    public ModelAndView saveBranch(@RequestParam Map<String, String> paramMap, ModelMap model) {
        String provinceId = paramMap.get("provinceId");
        String name = paramMap.get("name");
        String address = paramMap.get("address");
        String telephone = paramMap.get("telephone");
        String fax = paramMap.get("fax");
        ModelAndView mv = new ModelAndView();
        BranchDto branchDto = new BranchDto(name, address, telephone, fax, provinceId);
        try {
            boolean isSaved = branchService.addNewBranch(branchDto);
            mv.setViewName("redirect:/add-branch");
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("error");
        }
        return mv;
    }
}
