package com.four.service.Impl;

import com.four.dao.ZxhDao;
import com.four.entity.Apartment;
import com.four.entity.Consultinglist;
import com.four.entity.t_sellzu;
import com.four.entity.t_zhaofang;
import com.four.mysqlzc.ReadOnlyConnection;
import com.four.service.ZxhTwoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ZxhTwoServiceImpl implements ZxhTwoService {

    @Autowired
    private ZxhDao zxhdao;

    @Override
    public String insertZhaoFang(t_zhaofang zhao) {
        System.err.println("cccccccccccccccccccccccccccccccccccccccccccc");
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        zhao.setFabutime(sim.format(new Date()));
        System.err.println("zxczxczxczxczxczxczxczxc"+zhao);
        zxhdao.insertZhaoFang(zhao);
        return "success";
    }

    @Override
    public String insertWeiSellZu(t_sellzu sell) {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sell.setFabutime(sim.format(new Date()));
        zxhdao.insertWeiSellZu(sell);
        return "success";
    }

    @ReadOnlyConnection
    @Override
    public List<Apartment> queryApartment() {
        List<Apartment> list = zxhdao.queryApartment();
        return list;
    }

    @ReadOnlyConnection
    @Override
    public List<Consultinglist> selectZiXun() {
        List<Consultinglist> list = zxhdao.selectZiXun();
        return list;
    }

}
