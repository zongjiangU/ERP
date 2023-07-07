package com.example.erpserver.dao;

import com.example.erpserver.entity.db.YuanGongInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
create table yuangong_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    bumen TEXT NOT NULL,
    name TEXT NOT NULL,
    zhiwei TEXT NOT NULL,
    ruzhi_time BIGINT NOT NULL,
    id_card TEXT NOT NULL,
    jiguan TEXT NOT NULL,
    xingbie TEXT NOT NULL,
    hetongqishi_time BIGINT NOT NULL,
    hetongjieshu_time BIGINT NOT NULL,
    hetong_qixian TEXT NOT NULL,
    yongong_type TEXT NOT NULL,
    phone TEXT NOT NULL
);

* */
@Mapper
public interface YuangongInfoDao {

    @Insert("insert into yuangong_info (bumen, name, zhiwei, ruzhi_time, id_card, jiguan, xingbie, hetongqishi_time, hetongjieshu_time, hetong_qixian, yongong_type, phone) values (#{bumen}, #{name}, #{zhiwei}, #{ruzhiTime}, #{idCard}, #{jiguan}, #{xingbie}, #{hetongqishiTime}, #{hetongjieshuTime}, #{hetongQixian}, #{yongongType}, #{phone})")
    void insertYuangongInfo(YuanGongInfo yuangongInfo);

    @Delete("delete from yuangong_info where id=#{id}")
    void deleteYuangongInfoById(int id);

    @Update("update yuangong_info set bumen=#{bumen}, name=#{name}, zhiwei=#{zhiwei}, ruzhi_time=#{ruzhiTime}, id_card=#{idCard}, jiguan=#{jiguan}, xingbie=#{xingbie}, hetongqishi_time=#{hetongqishiTime}, hetongjieshu_time=#{hetongjieshuTime}, hetong_qixian=#{hetongQixian}, yongong_type=#{yongongType}, phone=#{phone} where id=#{id}")
    void updateYuangongInfo(YuanGongInfo yuangongInfo);

    @Select("select * from yuangong_info limit #{limit} offset #{offset}")
    List<YuanGongInfo> getYuangongInfoList(int limit, int offset);
}
