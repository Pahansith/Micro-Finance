package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.LoginInfoDto;
import edu.ijse.gdse39.microfinance.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Pahansith on 10/3/2017
 * @project MicroFinance
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@RequestParam(value = "username") String userName,
                                  @RequestParam(value = "password") String password, HttpServletRequest request){

        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        LoginInfoDto loginInfoDto = null;
        try {
            loginInfoDto = loginService.logUser(userName, password);
            String userPrivilage = loginInfoDto.getUserPrivilage();


            if (null != loginInfoDto) {
                if (userPrivilage.equals("CUSTOMER")) {
                    mv.setViewName("customer/customer-home");
                    session.setAttribute("loginInfoDto", loginInfoDto);
                    return mv;
                }
                session.setAttribute("loggedInUserId", loginInfoDto.getId());
                session.setAttribute("loginInfo", loginInfoDto);
                mv.setViewName("admin/admin-home");
                return mv;
            }
            mv.setViewName("admin/error-page");
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("admin/error-page");
        }

        return mv;

    }
}
