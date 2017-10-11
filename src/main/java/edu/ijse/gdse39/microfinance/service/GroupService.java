package edu.ijse.gdse39.microfinance.service;

import edu.ijse.gdse39.microfinance.dto.GroupDto;
import edu.ijse.gdse39.microfinance.dto.MemberDto;

import java.util.ArrayList;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */

public interface GroupService {
    ArrayList<MemberDto> getMemberGroupDetails(int memberId);
}
