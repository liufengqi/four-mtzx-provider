package com.four.dao;

import com.four.entity.Apartment;
import com.four.entity.Consultinglist;
import com.four.entity.t_sellzu;
import com.four.entity.t_zhaofang;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ZxhDao {

    @Insert("insert into T_ZHAOFANG values(zhaofangid,#{zhao.phone},#{zhao.lianxiren},#{zhao.weituotype},#{zhao.fabutime},#{zhao.xiwangquyu},#{zhao.hangye},#{zhao.xuqiu})")
    void insertZhaoFang(@Param("zhao") t_zhaofang zhao);

    @Insert("insert into t_sellzu values(weituoid,#{se.phone},#{se.weituotype},#{se.wuyeid},#{se.fangyuandz},#{se.fymianji},#{se.qwjiage},#{se.fabutime},#{se.xwquyu})")
    void insertWeiSellZu(@Param("se") t_sellzu sell);

    @Select("select * from t_apartment a where a.statusup=1")
    List<Apartment> queryApartment();

    @Select("SELECT * FROM T_CONSULTINGLIST C ORDER BY C.DIANLU DESC LIMIT 0,10")
    List<Consultinglist> selectZiXun();
}
