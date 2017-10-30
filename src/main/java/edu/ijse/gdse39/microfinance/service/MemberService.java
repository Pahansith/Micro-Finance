package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.MemberDto;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */

public interface MemberService {
    ArrayList<MemberDto> getMemberListForLoan(int soceityId);

    MemberDto getSelectedMember(int memId);

    ArrayList<MemberDto> getPendingApproveLoanList(int societyId);

    boolean saveMember(Map<String, String> requestParams);
}
