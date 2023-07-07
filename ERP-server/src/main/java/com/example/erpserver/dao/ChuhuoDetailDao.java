package com.example.erpserver.dao;

import com.example.erpserver.entity.db.ChuohuoDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
create table chuhuo_detail (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    total_num REAL NOT NULL,
    tax_rate REAL NOT NULL,
    tax_type TEXT NOT NULL
);
* */
@Mapper
public interface ChuhuoDetailDao {

    @Insert("insert into chuhuo_detail (time, money_id, hetong_name, customer, total_num, tax_rate, tax_type) values (#{time}, #{moneyId}, #{hetongName}, #{customer}, #{totalNum}, #{taxRate}, #{taxType})")
    void insertChuhuoDetail(ChuohuoDetail chuohuoDetail);

    @Select("select * from chuhuo_detail where limit #{limit} offset #{offset}")
    List<ChuohuoDetail> getChuhuoDetailList(int limit, int offset);

    @Select("select count(*) from chuhuo_detail")
    Integer getChuhuoDetailCount();

    @Update("update chuhuo_detail set time=#{time}, money_id=#{moneyId}, hetong_name=#{hetongName}, customer=#{customer}, total_num=#{totalNum}, tax_rate=#{taxRate}, tax_type=#{taxType} where id=#{id}")
    void updateChuhuoDetail(ChuohuoDetail chuhuoDetail);

    @Delete("delete from chuhuo_detail where id=#{id}")
    void deleteChuhuoDetailById(int id);



}
