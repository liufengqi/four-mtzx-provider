package com.four.entity;

import java.io.Serializable;

public class Huijin implements Serializable {

    private static final long serialVersionUID = -2535892003562853099L;
    //会员管理金钱管理
    private Integer huijinid;
    private String huijinzhanghao;
    private Integer huijinkymoney;
    private String huijinshuiming;
    private Integer huijinmoneysl;
    private String huijindate;
    private String huijinip;

    private String huijizhanghao;

    public Integer getHuijinid() {
        return huijinid;
    }

    public void setHuijinid(Integer huijinid) {
        this.huijinid = huijinid;
    }

    public String getHuijinzhanghao() {
        return huijinzhanghao;
    }

    public void setHuijinzhanghao(String huijinzhanghao) {
        this.huijinzhanghao = huijinzhanghao;
    }

    public Integer getHuijinkymoney() {
        return huijinkymoney;
    }

    public void setHuijinkymoney(Integer huijinkymoney) {
        this.huijinkymoney = huijinkymoney;
    }

    public String getHuijinshuiming() {
        return huijinshuiming;
    }

    public void setHuijinshuiming(String huijinshuiming) {
        this.huijinshuiming = huijinshuiming;
    }

    public Integer getHuijinmoneysl() {
        return huijinmoneysl;
    }

    public void setHuijinmoneysl(Integer huijinmoneysl) {
        this.huijinmoneysl = huijinmoneysl;
    }

    public String getHuijindate() {
        return huijindate;
    }

    public void setHuijindate(String huijindate) {
        this.huijindate = huijindate;
    }

    public String getHuijinip() {
        return huijinip;
    }

    public void setHuijinip(String huijinip) {
        this.huijinip = huijinip;
    }

    public String getHuijizhanghao() {
        return huijizhanghao;
    }

    public void setHuijizhanghao(String huijizhanghao) {
        this.huijizhanghao = huijizhanghao;
    }

    @Override
    public String toString() {
        return "Huijin{" +
                "huijinid=" + huijinid +
                ", huijinzhanghao='" + huijinzhanghao + '\'' +
                ", huijinkymoney=" + huijinkymoney +
                ", huijinshuiming='" + huijinshuiming + '\'' +
                ", huijinmoneysl=" + huijinmoneysl +
                ", huijindate='" + huijindate + '\'' +
                ", huijinip='" + huijinip + '\'' +
                ", huijizhanghao='" + huijizhanghao + '\'' +
                '}';
    }
}
