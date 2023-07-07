package com.example.erpserver.dao;

import com.example.erpserver.entity.db.ProductPlain;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
create table product_plain (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    customer TEXT NOT NULL,
    point_type TEXT NOT NULL,
    num INTEGER NOT NULL,
    half TEXT NOT NULL,
    fenghe TEXT NOT NULL,
    hz_time BIGINT NOT NULL,
    yh_time BIGINT NOT NULL,
    extend TEXT NOT NULL
);
 */
@Mapper
public interface ProductPlainDao {
    @Select("select * from product_plain where limit #{limit} offset #{offset}")
    List<ProductPlain> getProductPlainList(int limit, int offset);

    @Insert("insert into product_plain (customer, point_type, num, half, fenghe, hz_time, yh_time, extend) values (#{customer}, #{pointType}, #{num}, #{half}, #{fenghe}, #{hzTime}, #{yhTime}, #{extend})")
    void insertProductPlain(ProductPlain productPlain);

    @Update("update product_plain set customer=#{customer}, point_type=#{pointType}, num=#{num}, half=#{half}, fenghe=#{fenghe}, hz_time=#{hzTime}, yh_time=#{yhTime}, extend=#{extend} where id=#{id}")
    void updateProductPlain(ProductPlain productPlain);

    @Delete("delete from product_plain where id=#{id}")
    void deleteProductPlainById(int id);

}
