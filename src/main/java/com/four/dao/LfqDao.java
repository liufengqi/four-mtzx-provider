package com.four.dao;


import com.four.entity.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface LfqDao {
    @Select("select * from t_user where username=#{username}")
    List<User> queryuser(String username);

    @Select("select min(pid) from t_tree where ids=#{a}")
    Integer querytree(Integer a);

    @Select("select * from t_tree where pid=#{pid} and ids=#{a}")
    List<Tree> queryTreeAgain(@Param("a") Integer a, @Param("pid") Integer pid);

    @Select("select * from t_metro ORDER BY xuhao")
    List<Metro> queryMetro();

    @Select("select max(xuhao)+1 from t_metro")
    Integer queryxuhao();

    @Insert("insert into t_metro values(#{id},#{name},#{xuhao},#{createdate})")
    void addditiexianlu(Metro metro);

    @Delete("delete from t_metro where id=#{id}")
    void deleteditie(Integer id);

    @Delete("delete from t_metro where id=#{ids}")
    void deleteidspishan(@Param("ids") String s);

    @Select("select * from t_metro where id=#{id}")
    Metro updateditiehui(Integer id);

    @Update("update t_metro set name=#{name},xuhao=#{xuhao} where id=#{id}")
    void updateditiegai(Metro metro);
    //---------------房屋楼层设置
    @Select("select * from t_overstory ORDER BY xuhao")
    List<Overstory> queryOverstory();

    @Select("select max(xuhao)+1 from t_overstory")
    Integer queryfwlcxuhao();

    @Insert("insert into t_overstory values(#{id},#{name},#{xuhao},#{createdate})")
    void adddfanglcsz(Overstory overstory);

    @Delete("delete from t_overstory where id=#{id}")
    void deletefwcxsz(Integer id);

    @Delete("delete from t_overstory where id=#{ids}")
    void deletefwcxpishan(@Param("ids") String s);

    @Select("select * from t_overstory where id=#{id}")
    Overstory updatefwcxhui(Integer id);

    @Update("update t_overstory set name=#{name},xuhao=#{xuhao} where id=#{id}")
    void updatefwcxszgai(Overstory overstory);

    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid and c.huizcxzid=1")
    List<Map<Object,String>> queryHuiji();

    @Select("select  qx.*  from t_user u,t_jurisdiction qx,t_JUzj zj where u.userid=zj.userid and " +
            " zj.qid=qx.qid and u.userid=#{userid}")
    List queryQuxan(@Param("userid") Integer userid);

    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid and a.huijiid=#{id}")
    Huiji updatesyhyhuicha(@Param("id") String id);

    @Select("select * from huideng")
    List<Huideng> queryhydj();

    @Select("select * from t_area where pid=0")
    List<Area> querydrea();

    @Select("select * from t_area where pid=#{id}")
    List<Area> querydreadifangid(@Param("id") String id);

    @Update("update huiji set  huijipass=#{huijipass}, huijilianxiren=#{huijilianxiren}, huijiyouxiang=#{huijiyouxiang}, huijinicheng=#{huijinicheng}, huijishifoubyx=#{huijishifoubyx}, huijishifoubsj=#{huijishifoubsj}, huijishouji=#{huijishouji}, huijidianhua=#{huijidianhua}, huijiqq=#{huijiqq}, huijiquyu=#{huijiquyu}, huijiquyudf=#{huijiquyudf}, huijitouxiang=#{huijitouxiang},huijierweima=#{huijierweima}, huijimendiandz=#{huijimendiandz}, huijizhongjiemc=#{huijizhongjiemc}, huijizwojsgc=#{huijizwojsgc}, huijidituzb=#{huijidituzb}, huijidpgjc=#{huijidpgjc}, huijinid=#{huijinid}, huisysxl=#{huisysxl}, huiquanxian=#{huiquanxian}, huidjdqdate=#{huidjdqdate},huidengid=#{huidengid} where huijiid=#{huijiid}")
    void updatesyhygai(Huiji hji);

    @Select("select * from huirenzhuang b,huiji a where b.huirenid=a.huijiid and b.huirenid=#{id}")
    Huirenzhuang queryhuiyuanrenzhneg(@Param("id") String id);

    @Update("update huirenzhuang set huirenztai=#{huirenztai},huishenid=#{huishenid},huirenjjyy=#{huirenjjyy},huirenzsxm=#{huirenzsxm},huirensfzh=#{huirensfzh},huirensfzzm=#{huirensfzzm},huirensfzfm=#{huirensfzfm} where huirenid=#{huirenid}")
    void updatexiugairz(Huirenzhuang rz);

    @Select("select a.yuanname ,s.weituoid,s.fangyuandz ,s.fymianji ,s.lianxiren, s.phone ,s.fabutime ,s.qwjiage,s.weituotype from t_sellzu s,t_apartment a where s.wuyeid=a.id ")
    List<t_sellzu> queryWTMZ();

    @Delete("delete from t_sellzu where weituoid = #{ids}")
    void deleteMZ(@Param("ids") String ids);

    @Select("select * from t_esfjgzs")
    List<Esfjgzs> queryshoukuan();

    @Select("select * from t_zhaofang z")
    List<Map<String, Object>> queryWTZF();

    @Delete("delete from t_zhaofang where zhaofangid=#{idse}")
    void deleteZF(@Param("idse") String idse);

    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid")
    List<Map<Object,String>> queryHuijissss();

    @Select("select * from huijin a, huiji b where a.huijinid=b.huijiid and a.huijinid=${id}")
    Huijin queryhyrenzhengshenhe(@Param("id") String id);

    @Update("update huijin set huijinshuiming=#{huijinshuiming},huijinmoneysl=#{huijinmoneysl},huijindate=#{huijindate} where huijinid=#{huijinid}")
    void updatejqglhui(Huijin hj);

    @Select("select userphone from t_user where userphone=#{phone}")
    String fasongyzm(@Param("phone") String phone);

    @Insert("insert into t_user values(#{userid},#{username},#{userpass},#{userphone})")
    void zhuceuser(User user);

    @Select("select * from t_user where username=#{username} or userphone=#{username}")
    List<User> queryname(@Param("username") String username);

    @Select("select a.*,b.id as arid,b.name as arname,o.name as orname,ar.name as arename" +
            " from t_housing a,t_area b,t_orientation o,t_area ar " +
            "where a.areaid=b.id and a.orientationid=o.id and a.districtid=ar.id")
    List<Map<Object, String>> queryhousingdiv();
}
