package com.example.erpserver.entity.db;

import lombok.Data;

@Data
public class UserInfo {
    Integer id;
    String name;
    String password;
    String role;
}
