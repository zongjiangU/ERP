package com.example.erpserver.entity.db;

import lombok.Data;

@Data
public class OrderInfo {
    Integer id;
    String orderId;
    String moneyId;
    String customer;
    String hetong;
    Long chuhuoTime;
    Integer orderNum;
    Double price;
    Long hetongStartTime;
    Long fukuanTime;
    String extend;
}
