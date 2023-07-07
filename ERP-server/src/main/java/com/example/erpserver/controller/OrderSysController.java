package com.example.erpserver.controller;

import com.example.erpserver.entity.ErpResult;
import com.example.erpserver.entity.db.OrderInfo;
import com.example.erpserver.entity.db.ProductPlain;
import com.example.erpserver.service.OrderSysService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class OrderSysController {

    @Resource
    OrderSysService orderSysService;

    @GetMapping("vue-element-admin/ordersys/getListOrderInfo")
    public ErpResult<Object> getList(@Param("page") Integer page,
                             @Param("limit") Integer limit) {
        return ErpResult.success(orderSysService.getListOrderInfo(page, limit));
    }

    @PostMapping("vue-element-admin/ordersys/addOrderInfo")
    public ErpResult<Object> add(@RequestBody OrderInfo req) {
        return ErpResult.success(orderSysService.addOrderInfo(req));
    }

    @GetMapping("vue-element-admin/ordersys/deleteOrderInfo")
    public ErpResult<Object> delete(@RequestParam("id") Integer id) {
        return ErpResult.success(orderSysService.deleteOrderInfo(id));
    }

    @PostMapping("vue-element-admin/ordersys/updateOrderInfo")
    public ErpResult<Object> update(@RequestBody OrderInfo req) {
        return ErpResult.success(orderSysService.updateOrderInfo(req));
    }

    @GetMapping("vue-element-admin/ordersys/getListProductPlain")
    public ErpResult<Object> getListProductPlain(@Param("page") Integer page,
                             @Param("limit") Integer limit) {
        return ErpResult.success(orderSysService.getListProductPlain(page, limit));
    }

    @PostMapping("vue-element-admin/ordersys/addProductPlain")
    public ErpResult<Object> addProductPlain(@RequestBody ProductPlain req) {
        return ErpResult.success(orderSysService.addProductPlain(req));
    }

    @GetMapping("vue-element-admin/ordersys/deleteProductPlain")
    public ErpResult<Object> deleteProductPlain(@RequestParam("id") Integer id) {
        return ErpResult.success(orderSysService.deleteProductPlain(id));
    }

    @PostMapping("vue-element-admin/ordersys/updateProductPlain")
    public ErpResult<Object> updateProductPlain(@RequestBody ProductPlain req) {
        return ErpResult.success(orderSysService.updateProductPlain(req));
    }

}
