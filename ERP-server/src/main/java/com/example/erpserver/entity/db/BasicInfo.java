package com.example.erpserver.entity.db;

import lombok.Data;
@Data
public class BasicInfo {
    Integer id;
    double tax;
    String type;
    String customer;
    String provider;
}
