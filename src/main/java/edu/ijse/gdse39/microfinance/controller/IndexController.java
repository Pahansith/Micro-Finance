package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.AccountCreateDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 10/3/2017
 * @project MicroFinance
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String mapIndexFile(){
        return "index";
    }

    @RequestMapping(value = "/index")
    public String mapIndexFile2(){
        return "index";
    }

    @RequestMapping(value = "/register")
    public String mapRegisterView(){
        return "register";
    }

    @RequestMapping(value = "/account-create")
    public ModelAndView mapAccountCreateView() {
        ModelAndView mv = new ModelAndView("account-create");
        mv.addObject("accountCreateDto", new AccountCreateDto());
        return mv;
    }

    @RequestMapping(value = "/error")
    public ModelAndView mapAccountErrorView() {
        ModelAndView mv = new ModelAndView("error");
        return mv;
    }

    @RequestMapping(value = "/user-notfound")
    public ModelAndView userNotFoundView() {
        ModelAndView mv = new ModelAndView("user-notfound");
        return mv;
    }

    @RequestMapping(value = "/admin-home")
    public ModelAndView adminHomeView() {
        ModelAndView mv = new ModelAndView("admin/admin-home");
        return mv;
    }

}
