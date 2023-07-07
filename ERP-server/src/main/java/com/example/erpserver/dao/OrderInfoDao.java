package com.example.erpserver.dao;

import com.example.erpserver.entity.db.OrderInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
    create table order_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    order_id TEXT NOT NULL UNIQUE,
    money_id TEXT NOT NULL,
    customer TEXT NOT NULL,
    hetong TEXT NOT NULL,
    chuhuo_time BIGINT NOT NULL,
    order_num INTEGER NOT NULL,
    price REAL NOT NULL,
    hetong_start_time BIGINT NOT NULL,
    fukuan_time BIGINT,
    extend TEXT NOT NULL
);
*/
@Mapper
public interface OrderInfoDao {

    @Select("select * from order_info limit #{limit} offset #{offset}")
    List<OrderInfo> getOrderInfoList(int limit, int offset);

    @Update("update order_info set order_id=#{order_id}, money_id=#{moneyId}, customer=#{customer}, hetong=#{hetong}, chuhuo_time=#{chuhuoTime}, order_num=#{orderNum}, price=#{price}, hetong_start_time=#{hetongStartTime}, fukuan_time=#{fukuanTime}, extend=#{extend} where id=#{id}")
    void updateOrderInfo(OrderInfo orderInfo);

    @Delete("delete from order_info where id=#{id}")
    void deleteOrderInfoById(int id);

    @Insert("insert into order_info (order_id, money_id, customer, hetong, chuhuo_time, order_num, price, hetong_start_time, fukuan_time, extend) values (#{order_id}, #{money_id}, #{customer}, #{hetong}, #{chuhuoTime}, #{orderNum}, #{price}, #{hetongStartTime}, #{fukuanTime}, #{extend})")
    void insertOrderInfo(OrderInfo orderInfo);


}
