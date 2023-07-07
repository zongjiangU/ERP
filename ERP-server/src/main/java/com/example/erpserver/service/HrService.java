package com.example.erpserver.service;

import com.example.erpserver.dao.YuangongInfoDao;
import com.example.erpserver.entity.db.YuanGongInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HrService {
    @Resource
    YuangongInfoDao yuangongInfoDao;

    public Object getListYuanGong(Integer page, Integer limit){
        return yuangongInfoDao.getYuangongInfoList(limit, (page-1) * limit);
    }

    public Object addYuanGong(YuanGongInfo req){
        yuangongInfoDao.insertYuangongInfo(req);
        return "success";
    }

    public Object deleteYuanGong(Integer id){
        yuangongInfoDao.deleteYuangongInfoById(id);
        return "success";
    }

    public Object updateYuanGong(YuanGongInfo req){
        yuangongInfoDao.updateYuangongInfo(req);
        return "success";
    }

}
