package edu.ijse.gdse39.microfinance.service.impl;

import edu.ijse.gdse39.microfinance.dao.UserAccountDao;
import edu.ijse.gdse39.microfinance.dto.LoginInfoDto;
import edu.ijse.gdse39.microfinance.model.RoleModel;
import edu.ijse.gdse39.microfinance.model.SystemUser;
import edu.ijse.gdse39.microfinance.service.LoginService;
import edu.ijse.gdse39.microfinance.service.mapper.ModelToDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Pahansith on 10/21/2017
 * @project MicroFinance
 */

@Service
@Transactional
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserAccountDao userAccountDao;

    @Override
    public LoginInfoDto logUser(String userName, String pwd) throws Exception {
        SystemUser user = userAccountDao.getUser(userName, pwd);
        RoleModel role = null;
        if (null != user){
            role = user.getRole();
            return new ModelToDtoMapper().mapUserAccount(user,role);
        }
        return null;
    }
}
