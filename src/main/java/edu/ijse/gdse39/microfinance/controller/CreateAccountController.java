package edu.ijse.gdse39.microfinance.controller;

import edu.ijse.gdse39.microfinance.dto.AccountCreateDto;
import edu.ijse.gdse39.microfinance.service.AccountCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */
@Controller
@RequestMapping(path = "/account-create")
public class CreateAccountController {

    @Autowired
    private AccountCreateService accountCreateService;


    @RequestMapping(value = "/new-account", method = RequestMethod.POST)
    public ModelAndView createAccount(@Valid @ModelAttribute("accountCreateDto") AccountCreateDto accountCreateDto) {
        ModelAndView mv = new ModelAndView();

        try {
            boolean isSaved = accountCreateService.createNewAccount(accountCreateDto);
            if (isSaved) {
                mv.setViewName("redirect:/register");
            } else {
                mv.setViewName("redirect:/error");
            }
        } catch (Exception e) {
            e.printStackTrace();
            mv.setViewName("redirect:/error");
        }
        return mv;
    }

}
