package com.four.dao;

import com.four.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LfqDao {

    @Select("select userphone from t_user where userphone=#{phone}")
    String fasongyzm(@Param("phone") String phone);

    @Insert("insert into t_user values(#{userid},#{username},#{userpass},#{userphone})")
    void zhuceuser(User user);

    @Select("select * from t_user where username=#{username} or userphone=#{username}")
    List<User> queryname(@Param("username") String username);

}
