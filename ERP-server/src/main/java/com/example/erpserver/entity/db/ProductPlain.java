package com.example.erpserver.entity.db;

import lombok.Data;

@Data
public class ProductPlain {
    Integer id;
    String customer;
    String pointType;
    Integer num;
    String half;
    String fenghe;
    Long hzTime;
    Long yhTime;
    String extend;
}
