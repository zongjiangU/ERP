package com.example.erpserver.dao;

import com.example.erpserver.entity.db.BasicInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
create table basic_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tax INTEGER NOT NULL,
    type TEXT NOT NULL,
    customer TEXT NOT NULL,
    provider TEXT NOT NULL
);
 */
@Mapper
public interface BasicInfoDao {

    @Select("select * from basic_info where customer like '%' || ${customer} || '%' and provider like '%' || #{provider} || '%' limit ${limit} offset ${offset}")
    List<BasicInfo> getBasicInfoList(@Param("customer") Object customer, @Param("provider") String provider,@Param("limit") Integer limit, @Param("offset") Integer offset);

    @Select("select count(*) from basic_info where customer like '%' || ${customer} || '%' and provider like '%' || #{provider} || '%'")
    Integer getBasicInfoCount(String customer, String provider);

    @Insert("insert into basic_info (tax, type, customer, provider) values (#{tax}, #{type}, #{customer}, #{provider})")
    void insertBasicInfo(BasicInfo basicInfo);

    @Update("update basic_info set tax=#{tax}, type=#{type}, customer=#{customer}, provider=#{provider} where id=#{id}")
    void updateBasicInfo(BasicInfo basicInfo);

    @Delete("delete from basic_info where id=#{id}")
    void deleteBasicInfoById(int id);
}
