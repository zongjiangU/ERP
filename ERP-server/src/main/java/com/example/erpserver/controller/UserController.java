package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.LoginReq;
import com.example.erpserver.entity.LoginResp;
import com.example.erpserver.entity.UserInfoResp;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import java.util.Arrays;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    @PostMapping("dev-api/user/login")
    public ErpResult<LoginResp> login(@RequestBody LoginReq req) {
        LoginResp resp = new LoginResp();
        resp.setToken("admin-token");
        resp.setUsername("admin");
        resp.setPassword("123456");
        resp.setCode(200);
        return ErpResult.success(resp);
    }

    @GetMapping("dev-api/user/info")
    public ErpResult<UserInfoResp> userInfo(@RequestParam("token") String token) {
        UserInfoResp resp = new UserInfoResp();
        resp.setName("Super Admin");
        resp.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        resp.setIntroduction("I am a super administrator");
        resp.setRoles(Arrays.asList(new String[]{"admin"}));
        return ErpResult.success(resp);
    }

}
