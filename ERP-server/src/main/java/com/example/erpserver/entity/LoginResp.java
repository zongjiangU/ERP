package com.example.erpserver.entity;

import lombok.Data;

@Data
public class LoginResp {
    Integer code;
    String token;
    String username;
    String password;
}
