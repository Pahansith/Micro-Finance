package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.impl.MemberDaoImpl;
import edu.ijse.gdse39.microfinance.dto.MemberDto;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.model.ProvinceModel;
import edu.ijse.gdse39.microfinance.service.MemberService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberDaoImpl memberDao;

    public int testConn(ProvinceModel p){
        return memberDao.saveProvince(p);
    }

    @Override
    public ArrayList<MemberDto> getMemberListForLoan(int soceityId) {
        List<MemberModel> memberListForNewLoan = memberDao.getMemberListForNewLoan(soceityId);
        return new ModelToDtoMapper().mapMemberModelList(memberListForNewLoan);
    }

    @Override
    public MemberDto getSelectedMember(int memId) {
        MemberModel selectedMember = memberDao.getSelectedMember(memId);
        return new ModelToDtoMapper().mapMemberModel(selectedMember);
    }
}
