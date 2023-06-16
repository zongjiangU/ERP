package com.example.erpserver.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResp {
    List<String> roles;
    String introduction;
    String avatar;
    String name;
}
