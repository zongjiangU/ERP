package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.LoginReq;
import com.example.erpserver.entity.LoginResp;
import com.example.erpserver.entity.UserInfoResp;
import com.example.erpserver.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import javax.annotation.Resource;
import java.util.Arrays;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("vue-element-admin/user/login")
    public ErpResult<LoginResp> login(@RequestBody LoginReq req) {
        return userService.login(req);
    }

    @GetMapping("vue-element-admin/user/info")
    public ErpResult<UserInfoResp> userInfo(@RequestParam("token") String token) {
        UserInfoResp resp = new UserInfoResp();
        resp.setName("Super Admin");
        resp.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        resp.setIntroduction("I am a super administrator");
        resp.setRoles(Arrays.asList(new String[]{"admin"}));
        return ErpResult.success(resp);
    }

}
