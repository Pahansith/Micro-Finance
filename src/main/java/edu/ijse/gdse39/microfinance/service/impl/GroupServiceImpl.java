package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.GroupDao;
import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.service.GroupService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupDao groupDao;

    @Override
    public ArrayList<MemberDto> getMemberGroupDetails(int memberId) {
        List<MemberModel> memberGroupDetails = groupDao.getMemberGroupDetails(memberId);
        return new ModelToDtoMapper().mapMemberModelList(memberGroupDetails);
    }
}
