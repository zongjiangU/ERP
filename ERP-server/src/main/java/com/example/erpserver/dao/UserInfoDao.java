package com.example.erpserver.dao;

import com.example.erpserver.entity.db.UserInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserInfoDao {
    @Select("select * from user_info where name=#{name}")
    UserInfo getUserInfoByName(String name);

    @Update("update user_info set password=#{password} where name=#{name}")
    void updatePasswordByName(String name, String password);

    @Delete("delete from user_info where name=#{name}")
    void deleteUserInfoByName(String name);

    @Insert("insert into user_info (name, password) values (#{name}, #{password})")
    void insertUserInfo(UserInfo userInfo);
}
