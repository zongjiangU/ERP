package com.example.erpserver.entity.db;

import lombok.Data;
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
*/
@Data
public class ChuohuoDetail {
    Integer id;
    Long time;
    String moneyId;
    String hetongName;
    String customer;
    Double totalNum;
    Double taxRate;
    String taxType;
}
