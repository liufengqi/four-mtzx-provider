package com.four.service;

import com.four.entity.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface LfqService {

    String queryuser(User user);

    List<Tree> querytree(Integer a);

    List<Metro> queryMetro();

    Integer queryxuhao();

    void addditiexianlu(Metro metro);

    void deleteditie(Integer id);

    void deleteidspishan(String id);

    Metro updateditiehui(Integer id);

    void updateditiegai(Metro metro);

    List<Overstory> queryOverstory();

    Integer queryfwlcxuhao();

    void adddfanglcsz(Overstory overstory);

    void deletefwcxsz(Integer id);

    void deletefwcxpishan(String id);

    Overstory updatefwcxhui(Integer id);

    void updatefwcxszgai(Overstory overstory);

    List<Map<Object,String>> queryHuiji();

    List queryQuxan(Integer userid);

    Huiji updatesyhyhuicha(String id);

    List<Huideng> queryhydj();

    List<Area> querydrea();

    List<Area> querydreadifangid(String id);

    void updatesyhygai(Huiji hj);

    Huirenzhuang queryhuiyuanrenzhneg(String id);

    void updatexiugairz(Huirenzhuang rz);

    List<t_sellzu> queryWTMZ();

    void deleteMZ(String ids);

    Map<String , Object> queryshoukuan();

    List<Map<String,Object>> queryWTZF();

    void deleteZF(String idse);

    List<Map<Object,String>> queryHuijissss();

    Huijin queryhyrenzhengshenhe(String id);

    void updatejqglhui(Huijin hj);

    String fasongyzm(String phone);

    void zhuceuser(User user);

    String querydengluuser(User user);

    List<Map<Object, String>> queryhousingdiv();
}
