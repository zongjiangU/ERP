package com.example.erpserver.service;

import com.example.erpserver.dao.UserInfoDao;
import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.LoginReq;
import com.example.erpserver.entity.LoginResp;
import com.example.erpserver.entity.db.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserInfoDao userInfoDao;

    public ErpResult<LoginResp> login(LoginReq req){
        LoginResp resp = new LoginResp();

        UserInfo a = userInfoDao.getUserInfoByName(req.getUsername());
        if (a == null) {
            resp.setCode(60204);
            return ErpResult.fail(60204, "Account and password are incorrect.");
        }
        if (!a.getPassword().equals(req.getPassword())) {
            resp.setCode(60204);
            return ErpResult.fail(60204, "Account and password are incorrect.");
        }
        resp.setToken("admin-token");
        resp.setCode(200);
        return ErpResult.success(resp);
    }
}
