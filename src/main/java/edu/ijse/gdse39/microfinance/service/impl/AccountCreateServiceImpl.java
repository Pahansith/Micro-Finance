package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.MemberDao;
import edu.ijse.gdse39.microfinance.dao.RoleModelDao;
import edu.ijse.gdse39.microfinance.dao.SystemUserDao;
import edu.ijse.gdse39.microfinance.dao.UserAccountTempDao;
import edu.ijse.gdse39.microfinance.dto.AccountCreateDto;
import edu.ijse.gdse39.microfinance.exception.UserNotFoundException;
import edu.ijse.gdse39.microfinance.model.MemberModel;
import edu.ijse.gdse39.microfinance.model.RoleModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import edu.ijse.gdse39.microfinance.model.UserAccountTmp;
import edu.ijse.gdse39.microfinance.service.AccountCreateService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */

@Service
@Transactional
public class AccountCreateServiceImpl implements AccountCreateService {

    @Autowired
    UserAccountTempDao userAccountTempDao;

    @Autowired
    MemberDao memberDao;

    @Autowired
    SystemUserDao systemUserDao;

    @Autowired
    RoleModelDao roleModelDao;

    @Override
    public boolean createNewAccount(AccountCreateDto accountCreateDto) throws Exception {
        UserAccountTmp userAccountTmp = new UserAccountTmp();
        BeanUtils.copyProperties(userAccountTmp, accountCreateDto);
        return userAccountTempDao.saveUserAccountTemp(userAccountTmp);
    }

    @Override
    public List<AccountCreateDto> findAllPendingAccounts() throws Exception {
        List<UserAccountTmp> userAccountTmpList = userAccountTempDao.findAll();
        List<AccountCreateDto> accountCreateDtoList = new ArrayList<>();
        for (UserAccountTmp userAccountTmp : userAccountTmpList) {
            AccountCreateDto accountCreateDto = new AccountCreateDto();
            BeanUtils.copyProperties(accountCreateDto, userAccountTmp);
            accountCreateDtoList.add(accountCreateDto);
        }

        return accountCreateDtoList;
    }

    @Override
    public boolean authorizeMember(String memberId) throws Exception {
        long id = Long.parseLong(memberId);
        UserAccountTmp userAccountTmp = userAccountTempDao.findSelected(id);
        MemberModel memberModel = memberDao.findByNic(userAccountTmp.getNic());
        SystemUser systemUser = new SystemUser();
        systemUser.setName(userAccountTmp.getUserName());
        systemUser.setPassword(userAccountTmp.getPassword());
        RoleModel roleModel = roleModelDao.findRoleModel(RoleModel.ROLE_TYPE.CUSTOMER);
        systemUser.setRole(roleModel);
        if (memberModel != null) {
            memberModel.setSystemUser(systemUser);
        } else {
            userAccountTempDao.deleteById(id);
            throw new UserNotFoundException(id, "User Not Found");
        }
        systemUserDao.saveSystemUser(systemUser);

        memberDao.saveMember(memberModel);
        userAccountTempDao.deleteById(id);
        return true;
    }
}
