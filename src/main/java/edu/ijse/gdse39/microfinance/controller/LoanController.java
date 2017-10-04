package edu.ijse.gdse39.microfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pahansith on 10/4/2017
 * @project MicroFinance
 */
@Controller
public class LoanController {

    @RequestMapping(value = "/newLoan")
    public String  getLoanView(){
        return "new-loan";
    }

}
