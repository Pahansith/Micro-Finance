package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Pahansith on 10/3/2017
 * @project MicroFinance
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@RequestParam(value = "username") String userName,
                                    @RequestParam(value = "password") String password){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin-home");
        return mv;

    }
}
