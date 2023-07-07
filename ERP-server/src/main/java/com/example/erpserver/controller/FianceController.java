package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.db.ChuohuoDetail;
import com.example.erpserver.entity.db.FuliaoFapiao;
import com.example.erpserver.entity.db.ShouKuanDetail;
import com.example.erpserver.service.FianceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class FianceController {

    @Resource
    FianceService fianceService;

    @GetMapping("vue-element-admin/fiance/getListChuhuoDetail")
    public ErpResult<Object> getListChuhuoDetail(@RequestParam@Param("page") Integer page,
                                                 @Param("limit") Integer limit ) {
        return ErpResult.success(fianceService.getListChuhuoDetail(page, limit));
    }

    @PostMapping("vue-element-admin/fiance/addChuhuoDetail")
    public ErpResult<Object> addChuhuoDetail(@RequestBody ChuohuoDetail req) {
        return ErpResult.success(fianceService.addChuhuoDetail(req));
    }

    @GetMapping("vue-element-admin/fiance/deleteChuhuoDetail")
    public ErpResult<Object> deleteChuhuoDetail(@RequestParam("id") Integer id) {
        return ErpResult.success(fianceService.deleteChuhuoDetail(id));
    }

    @PostMapping("vue-element-admin/fiance/updateChuhuoDetail")
    public ErpResult<Object> updateChuhuoDetail(@RequestBody ChuohuoDetail req) {
        return ErpResult.success(fianceService.updateChuhuoDetail(req));
    }

    @GetMapping("vue-element-admin/fiance/getListFuliaoFaPiao")
    public ErpResult<Object> getListFuliaoDetail(@RequestParam@Param("page") Integer page,
                                                 @Param("limit") Integer limit ) {
        return ErpResult.success(fianceService.getListFuliaoFaPiao(page, limit));
    }

    @PostMapping("vue-element-admin/fiance/addFuliaoFaPiao")
    public ErpResult<Object> addFuliaoFaPiao(@RequestBody FuliaoFapiao req) {
        return ErpResult.success(fianceService.addFuliaoFaPiao(req));
    }

    @GetMapping("vue-element-admin/fiance/deleteFuliaoFaPiao")
    public ErpResult<Object> deleteFuliaoFaPiao(@RequestParam("id") Integer id) {
        return ErpResult.success(fianceService.deleteFuliaoFaPiao(id));
    }

    @PostMapping("vue-element-admin/fiance/updateFuliaoFaPiao")
    public ErpResult<Object> updateFuliaoFaPiao(@RequestBody FuliaoFapiao req) {
        return ErpResult.success(fianceService.updateFuliaoFaPiao(req));
    }

    @GetMapping("vue-element-admin/fiance/getListShoukuanDetail")
    public ErpResult<Object> getListShoukuanDetail(@RequestParam@Param("page") Integer page,
                                                 @Param("limit") Integer limit ) {
        return ErpResult.success(fianceService.getListShoukuanDetail(page, limit));
    }

    @PostMapping("vue-element-admin/fiance/addShoukuanDetail")
    public ErpResult<Object> addShoukuanDetail(@RequestBody ShouKuanDetail req) {
        return ErpResult.success(fianceService.addShoukuanDetail(req));
    }

    @GetMapping("vue-element-admin/fiance/deleteShoukuanDetail")
    public ErpResult<Object> deleteShoukuanDetail(@RequestParam("id") Integer id) {
        return ErpResult.success(fianceService.deleteShoukuanDetail(id));
    }

    @PostMapping("vue-element-admin/fiance/updateShoukuanDetail")
    public ErpResult<Object> updateShoukuanDetail(@RequestBody ShouKuanDetail req) {
        return ErpResult.success(fianceService.updateShoukuanDetail(req));
    }


}
