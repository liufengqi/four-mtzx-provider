package com.four.entity;

import java.io.Serializable;

public class Huideng implements Serializable{
    private static final long serialVersionUID = 4128077344931644282L;

    //会员管理会员等级表
    private Integer huidengid;
    private String huidengname;

    public Integer getHuidengid() {
        return huidengid;
    }

    public void setHuidengid(Integer huidengid) {
        this.huidengid = huidengid;
    }

    public String getHuidengname() {
        return huidengname;
    }

    public void setHuidengname(String huidengname) {
        this.huidengname = huidengname;
    }


    @Override
    public String toString() {
        return "Huideng{" +
                "huidengid=" + huidengid +
                ", huidengname='" + huidengname + '\'' +
                '}';
    }
}
