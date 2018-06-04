package com.four.entity;

import java.io.Serializable;

public class t_sellzu implements Serializable{
    private static final long serialVersionUID = 7603816301952968593L;
    private Integer weituoid;

    private String phone;

    private Integer weituotype;

    private String wuyeid;

    private String fangyuandz;

    private String fymianji;

    private String qwjiage;

    private String fabutime;

    private String xwquyu;

    private String hangye;

    private String lianxiren;

    public Integer getWeituoid() {
        return weituoid;
    }

    @Override
    public String toString() {
        return "t_sellzu{" +
                "weituoid=" + weituoid +
                ", phone='" + phone + '\'' +
                ", weituotype=" + weituotype +
                ", wuyeid='" + wuyeid + '\'' +
                ", fangyuandz='" + fangyuandz + '\'' +
                ", fymianji='" + fymianji + '\'' +
                ", qwjiage='" + qwjiage + '\'' +
                ", fabutime='" + fabutime + '\'' +
                ", xwquyu='" + xwquyu + '\'' +
                ", hangye='" + hangye + '\'' +
                ", lianxiren='" + lianxiren + '\'' +
                '}';
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    public void setWeituoid(Integer weituoid) {
        this.weituoid = weituoid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getWeituotype() {
        return weituotype;
    }

    public void setWeituotype(Integer weituotype) {
        this.weituotype = weituotype;
    }

    public String getWuyeid() {
        return wuyeid;
    }

    public void setWuyeid(String wuyeid) {
        this.wuyeid = wuyeid == null ? null : wuyeid.trim();
    }

    public String getFangyuandz() {
        return fangyuandz;
    }

    public void setFangyuandz(String fangyuandz) {
        this.fangyuandz = fangyuandz == null ? null : fangyuandz.trim();
    }

    public String getFymianji() {
        return fymianji;
    }

    public void setFymianji(String fymianji) {
        this.fymianji = fymianji == null ? null : fymianji.trim();
    }

    public String getQwjiage() {
        return qwjiage;
    }

    public void setQwjiage(String qwjiage) {
        this.qwjiage = qwjiage == null ? null : qwjiage.trim();
    }

    public String getFabutime() {
        return fabutime;
    }

    public void setFabutime(String fabutime) {
        this.fabutime = fabutime == null ? null : fabutime.trim();
    }

    public String getXwquyu() {
        return xwquyu;
    }

    public void setXwquyu(String xwquyu) {
        this.xwquyu = xwquyu == null ? null : xwquyu.trim();
    }

    public String getHangye() {
        return hangye;
    }

    public void setHangye(String hangye) {
        this.hangye = hangye == null ? null : hangye.trim();
    }

}