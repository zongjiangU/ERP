package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.db.YuanGongInfo;
import com.example.erpserver.service.HrService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class HrController {
    @Resource
    HrService hrService;

    @GetMapping("vue-element-admin/hr/getListYuanGong")
    public ErpResult<Object> getListYuanGong(@Param("page") Integer page,
                             @Param("limit") Integer limit) {
        return ErpResult.success(hrService.getListYuanGong(page, limit));
    }

    @PostMapping("vue-element-admin/hr/addYuanGong")
    public ErpResult<Object> addYuanGong(@RequestBody YuanGongInfo yuangongInfo){
        return ErpResult.success(hrService.addYuanGong(yuangongInfo));
    }

    @GetMapping("vue-element-admin/hr/deleteYuanGong")
    public ErpResult<Object> deleteYuanGong(@RequestParam("id") Integer id){
        return ErpResult.success(hrService.deleteYuanGong(id));
    }

    @PostMapping("vue-element-admin/hr/updateYuanGong")
    public ErpResult<Object> updateYuanGong(@RequestBody YuanGongInfo yuangongInfo){
        return ErpResult.success(hrService.updateYuanGong(yuangongInfo));
    }
}
