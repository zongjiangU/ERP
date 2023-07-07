package com.example.erpserver.entity.db;

import lombok.Data;

@Data
public class FuliaoFapiao {
    Integer id;
    Long time;
    String moneyId;
    String hetongName;
    String customer;
    Double totalNum;
    Double taxRate;
    String taxType;
    String taxNo;
    String extend;
}
