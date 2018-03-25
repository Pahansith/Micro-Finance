package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.AccountCreateDto;

import java.util.List;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */

public interface AccountCreateService {
    boolean createNewAccount(AccountCreateDto accountCreateDto) throws Exception;

    List<AccountCreateDto> findAllPendingAccounts() throws Exception;

    boolean authorizeMember(String memberId) throws Exception;
}
