package com.four.service;

import com.four.entity.Apartment;
import com.four.entity.Consultinglist;
import com.four.entity.t_sellzu;
import com.four.entity.t_zhaofang;

import java.util.List;

public interface ZxhTwoService {

    String insertZhaoFang(t_zhaofang zhao);

    String insertWeiSellZu(t_sellzu sell);

    List<Apartment> queryApartment();

    List<Consultinglist> selectZiXun();
}
