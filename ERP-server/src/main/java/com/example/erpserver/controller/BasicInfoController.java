package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.UserInfoResp;
import com.example.erpserver.entity.db.BasicInfo;
import com.example.erpserver.service.BasicInfoService;
import com.example.erpserver.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class BasicInfoController {
    @Resource
    BasicInfoService   basicInfoService;

    @GetMapping("vue-element-admin/basicinfo/getList")
    public ErpResult<Object> userInfo(@RequestParam("page") Integer page,
                                      @RequestParam("limit") Integer limit,
                                      @RequestParam(value = "customer",defaultValue = "") String customer,
                                      @RequestParam(value = "provider",defaultValue = "") String provider) {
        return  ErpResult.success(basicInfoService.getList(page, limit,customer,provider));
    }

    @PostMapping("vue-element-admin/basicinfo/add")
    public ErpResult<Object> add(@RequestBody BasicInfo req) {
        return  ErpResult.success(basicInfoService.add(req));
    }

    @GetMapping("vue-element-admin/basicinfo/delete")
    public ErpResult<Object> delete(@RequestParam("id") Integer id) {
        return  ErpResult.success(basicInfoService.delete(id));
    }

    @PostMapping("vue-element-admin/basicinfo/update")
    public ErpResult<Object> update(@RequestBody BasicInfo req) {
        return  ErpResult.success(basicInfoService.update(req));
    }
}
