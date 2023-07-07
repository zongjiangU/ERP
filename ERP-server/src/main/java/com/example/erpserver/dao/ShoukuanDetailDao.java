package com.example.erpserver.dao;

import com.example.erpserver.entity.db.ShouKuanDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;


/*
create table shoukuan_detail (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    yishou TEXT NOT NULL,
    zhanghu TEXT NOT NULL,
    extend TEXT NOT NULL
);
* */
@Mapper
public interface ShoukuanDetailDao {

    @Select("select * from shoukuan_detail limit #{limit} offset #{offset}")
    List<ShouKuanDetail> getShoukuanDetailList(int limit, int offset);

    @Select("select count(*) from shoukuan_detail")
    Integer getShoukuanDetailCount();

    @Insert("insert into shoukuan_detail (time, money_id, hetong_name, customer, yishou, zhanghu, extend) values (#{time}, #{money_id}, #{hetongName}, #{customer}, #{yishou}, #{zhanghu}, #{extend})")
    void insertShoukuanDetail(ShouKuanDetail shoukuanDetailDao);

    @Update("update shoukuan_detail set time=#{time}, money_id=#{money_id}, hetong_name=#{hetongName}, customer=#{customer}, yishou=#{yishou}, zhanghu=#{zhanghu}, extend=#{extend} where id=#{id}")
    void updateShoukuanDetail(ShouKuanDetail shoukuanDetailDao);

    @Delete("delete from shoukuan_detail where id=#{id}")
    void deleteShoukuanDetailById(int id);
}
