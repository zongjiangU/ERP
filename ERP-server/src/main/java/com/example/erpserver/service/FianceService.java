package com.example.erpserver.service;

import com.example.erpserver.dao.ChuhuoDetailDao;
import com.example.erpserver.dao.FuliaoFaPiaoDao;
import com.example.erpserver.dao.ShoukuanDetailDao;
import com.example.erpserver.entity.db.ChuohuoDetail;
import com.example.erpserver.entity.db.FuliaoFapiao;
import com.example.erpserver.entity.db.ShouKuanDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FianceService {
    @Resource
    ChuhuoDetailDao chuhuoDetailDao;

    @Resource
    FuliaoFaPiaoDao fuliaoFapiaoDao;

    @Resource
    ShoukuanDetailDao shoukuanDetailDao;

    public Object getListChuhuoDetail(Integer page, Integer limit){
        List<ChuohuoDetail> li = chuhuoDetailDao.getChuhuoDetailList(limit, (page-1) * limit);
        Integer count = chuhuoDetailDao.getChuhuoDetailCount();
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("items", li);
        map.put("total", count);
        return map;
    }

    public Object addChuhuoDetail(ChuohuoDetail req){
        chuhuoDetailDao.insertChuhuoDetail(req);
        return "success";
    }

    public Object deleteChuhuoDetail(Integer id){
        chuhuoDetailDao.deleteChuhuoDetailById(id);
        return "success";
    }

    public Object updateChuhuoDetail(ChuohuoDetail req){
        chuhuoDetailDao.updateChuhuoDetail(req);
        return "success";
    }

    public Object getListFuliaoFaPiao(Integer page, Integer limit){
        List<FuliaoFapiao> li = fuliaoFapiaoDao.getFuliaoFaPiaoList(limit, (page-1) * limit);
        Integer count = fuliaoFapiaoDao.getFuliaoFaPiaoCount();
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("items", li);
        map.put("total", count);
        return map;
    }

    public Object addFuliaoFaPiao(FuliaoFapiao req){
        fuliaoFapiaoDao.insertFuliaoFaPiao(req);
        return "success";
    }

    public Object deleteFuliaoFaPiao(Integer id){
        fuliaoFapiaoDao.deleteFuliaoFaPiaoById(id);
        return "success";
    }

    public Object updateFuliaoFaPiao(FuliaoFapiao req){
        fuliaoFapiaoDao.updateFuliaoFaPiao(req);
        return "success";
    }

    public Object getListShoukuanDetail(Integer page, Integer limit){
        List<ShouKuanDetail> li = shoukuanDetailDao.getShoukuanDetailList(limit, (page-1) * limit);
        Integer count = shoukuanDetailDao.getShoukuanDetailCount();
        java.util.Map<String, Object> map = new java.util.HashMap<>();
        map.put("items", li);
        map.put("total", count);
        return map;
    }

    public Object addShoukuanDetail(ShouKuanDetail req){
        shoukuanDetailDao.insertShoukuanDetail(req);
        return "success";
    }

    public Object deleteShoukuanDetail(Integer id){
        shoukuanDetailDao.deleteShoukuanDetailById(id);
        return "success";
    }

    public Object updateShoukuanDetail(ShouKuanDetail req){
        shoukuanDetailDao.updateShoukuanDetail(req);
        return "success";
    }

}
