package com.four.entity;

import java.io.Serializable;

public class t_zhaofang implements Serializable{
    private static final long serialVersionUID = -4909683519612951522L;
    private Integer zhaofangid;

    private String phone;

    private String lianxiren;

    private String weituotype;

    private String fabutime;

    private String xiwangquyu;

    private String hangye;

    private String xuqiu;

    public Integer getZhaofangid() {
        return zhaofangid;
    }

    public void setZhaofangid(Integer zhaofangid) {
        this.zhaofangid = zhaofangid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren == null ? null : lianxiren.trim();
    }

    public String getWeituotype() {
        return weituotype;
    }

    public void setWeituotype(String weituotype) {
        this.weituotype = weituotype == null ? null : weituotype.trim();
    }

    public String getFabutime() {
        return fabutime;
    }

    public void setFabutime(String fabutime) {
        this.fabutime = fabutime == null ? null : fabutime.trim();
    }

    public String getXiwangquyu() {
        return xiwangquyu;
    }

    public void setXiwangquyu(String xiwangquyu) {
        this.xiwangquyu = xiwangquyu == null ? null : xiwangquyu.trim();
    }

    public String getHangye() {
        return hangye;
    }

    public void setHangye(String hangye) {
        this.hangye = hangye == null ? null : hangye.trim();
    }

    public String getXuqiu() {
        return xuqiu;
    }

    public void setXuqiu(String xuqiu) {
        this.xuqiu = xuqiu == null ? null : xuqiu.trim();
    }

    @Override
    public String toString() {
        return "t_zhaofang{" +
                "zhaofangid=" + zhaofangid +
                ", phone='" + phone + '\'' +
                ", lianxiren='" + lianxiren + '\'' +
                ", weituotype='" + weituotype + '\'' +
                ", fabutime='" + fabutime + '\'' +
                ", xiwangquyu='" + xiwangquyu + '\'' +
                ", hangye='" + hangye + '\'' +
                ", xuqiu='" + xuqiu + '\'' +
                '}';
    }
}