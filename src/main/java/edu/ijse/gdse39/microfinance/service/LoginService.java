package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.LoginInfoDto;

/**
 * @author Pahansith on 10/21/2017
 * @project MicroFinance
 */

public interface LoginService {
    public LoginInfoDto logUser(String userName, String pwd);
}
