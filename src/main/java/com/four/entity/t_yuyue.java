package com.four.entity;

import java.io.Serializable;

public class t_yuyue implements Serializable{

    private static final long serialVersionUID = 8299533638311627376L;
    private Integer yuyueid;
    private String yuyuexinxi;
    private Integer yuyuexingzhi;
    private String yuyuedianhua;
    private String yuyuedate;
    private String yuyueip;

    @Override
    public String toString() {
        return "t_yuyue{" +
                "yuyueid=" + yuyueid +
                ", yuyuexinxi='" + yuyuexinxi + '\'' +
                ", yuyuexingzhi=" + yuyuexingzhi +
                ", yuyuedianhua='" + yuyuedianhua + '\'' +
                ", yuyuedate='" + yuyuedate + '\'' +
                ", yuyueip='" + yuyueip + '\'' +
                '}';
    }

    public Integer getYuyueid() {
        return yuyueid;
    }

    public void setYuyueid(Integer yuyueid) {
        this.yuyueid = yuyueid;
    }

    public String getYuyuexinxi() {
        return yuyuexinxi;
    }

    public void setYuyuexinxi(String yuyuexinxi) {
        this.yuyuexinxi = yuyuexinxi;
    }

    public Integer getYuyuexingzhi() {
        return yuyuexingzhi;
    }

    public void setYuyuexingzhi(Integer yuyuexingzhi) {
        this.yuyuexingzhi = yuyuexingzhi;
    }

    public String getYuyuedianhua() {
        return yuyuedianhua;
    }

    public void setYuyuedianhua(String yuyuedianhua) {
        this.yuyuedianhua = yuyuedianhua;
    }

    public String getYuyuedate() {
        return yuyuedate;
    }

    public void setYuyuedate(String yuyuedate) {
        this.yuyuedate = yuyuedate;
    }

    public String getYuyueip() {
        return yuyueip;
    }

    public void setYuyueip(String yuyueip) {
        this.yuyueip = yuyueip;
    }
}
