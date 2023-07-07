package com.example.erpserver.service;

import com.example.erpserver.dao.BasicInfoDao;
import com.example.erpserver.entity.db.BasicInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class BasicInfoService {
    @Resource
    BasicInfoDao basicInfoDao;

    public Object getList(Integer page, Integer limit, String customer, String provider){
        List<BasicInfo>  list=  basicInfoDao.getBasicInfoList(customer, provider,limit, (page-1) * limit);
        Integer total = basicInfoDao.getBasicInfoCount(customer, provider);
        Map<String, Object> map = new java.util.HashMap<>();
        map.put("items", list);
        map.put("total", total);
        return map;
    }

    public Object add(BasicInfo req){
        basicInfoDao.insertBasicInfo(req);
        return "success";
    }

    public Object delete(Integer id){
        basicInfoDao.deleteBasicInfoById(id);
        return "success";
    }

    public Object update(BasicInfo req){
        basicInfoDao.updateBasicInfo(req);
        return "success";
    }
}
