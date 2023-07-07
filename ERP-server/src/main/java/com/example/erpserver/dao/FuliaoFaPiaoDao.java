package com.example.erpserver.dao;

import com.example.erpserver.entity.db.FuliaoFapiao;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
create table fuliao_fapiao (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    total_num REAL NOT NULL,
    tax_rate REAL NOT NULL,
    tax_type TEXT NOT NULL,
    tax_no TEXT NOT NULL,
    extend TEXT NOT NULL
);
* */
@Mapper
public interface FuliaoFaPiaoDao {
    @Insert("insert into fuliao_fapiao (time, money_id, hetong_name, customer, total_num, tax_rate, tax_type, tax_no, extend) values (#{time}, #{moneyId}, #{hetongName}, #{customer}, #{totalNum}, #{taxRate}, #{taxType}, #{taxNo}, #{extend})")
    void insertFuliaoFaPiao(FuliaoFapiao fuliaoFaPiao);

    @Delete("delete from fuliao_fapiao where id=#{id}")
    void deleteFuliaoFaPiaoById(int id);

    @Update("update fuliao_fapiao set time=#{time}, money_id=#{moneyId}, hetong_name=#{hetongName}, customer=#{customer}, total_num=#{totalNum}, tax_rate=#{taxRate}, tax_type=#{taxType}, tax_no=#{taxNo}, extend=#{extend} where id=#{id}")
    void updateFuliaoFaPiao(FuliaoFapiao fuliaoFaPiao);

    @Select("select * from fuliao_fapiao limit #{limit} offset #{offset}")
    List<FuliaoFapiao> getFuliaoFaPiaoList(int limit, int offset);

    @Select("select count(*) from fuliao_fapiao")
    Integer getFuliaoFaPiaoCount();

}
