package com.example.erpserver.service;

import com.example.erpserver.dao.OrderInfoDao;
import com.example.erpserver.dao.ProductPlainDao;
import com.example.erpserver.entity.db.OrderInfo;
import com.example.erpserver.entity.db.ProductPlain;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderSysService {
    @Resource
    ProductPlainDao productPlainDao;

    @Resource
    OrderInfoDao orderInfoDao;

    public Object getListProductPlain(Integer page, Integer limit){
        return productPlainDao.getProductPlainList(limit, (page-1) * limit);
    }

    public Object addProductPlain(ProductPlain req){
        productPlainDao.insertProductPlain(req);
        return "success";
    }

    public Object deleteProductPlain(Integer id){
        productPlainDao.deleteProductPlainById(id);
        return "success";
    }

    public Object updateProductPlain(ProductPlain req){
        productPlainDao.updateProductPlain(req);
        return "success";
    }

    public Object getListOrderInfo(Integer page, Integer limit){
        return orderInfoDao.getOrderInfoList(limit, (page-1) * limit);
    }

    public Object addOrderInfo(OrderInfo req){
        orderInfoDao.insertOrderInfo(req);
        return "success";
    }

    public Object deleteOrderInfo(Integer id){
        orderInfoDao.deleteOrderInfoById(id);
        return "success";
    }

    public Object updateOrderInfo(OrderInfo req){
        orderInfoDao.updateOrderInfo(req);
        return "success";
    }
}
