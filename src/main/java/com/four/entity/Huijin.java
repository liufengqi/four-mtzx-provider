package com.four.entity;

import java.io.Serializable;

public class Huijin implements Serializable {

    private static final long serialVersionUID = -2535892003562853099L;
    //会员管理金钱管理
    private Integer huijinid;
    private String huijinzhanghao;
    private String huijinkymoney;
    private String huijinshuiming;
    private String huijinmoneysl;
    private String huijindate;
    private String huijinip;

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

    public String getHuijinkymoney() {
        return huijinkymoney;
    }

    public void setHuijinkymoney(String huijinkymoney) {
        this.huijinkymoney = huijinkymoney;
    }

    public String getHuijinshuiming() {
        return huijinshuiming;
    }

    public void setHuijinshuiming(String huijinshuiming) {
        this.huijinshuiming = huijinshuiming;
    }

    public String getHuijinmoneysl() {
        return huijinmoneysl;
    }

    public void setHuijinmoneysl(String huijinmoneysl) {
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


    @Override
    public String toString() {
        return "Huijin{" +
                "huijinid=" + huijinid +
                ", huijinzhanghao='" + huijinzhanghao + '\'' +
                ", huijinkymoney='" + huijinkymoney + '\'' +
                ", huijinshuiming='" + huijinshuiming + '\'' +
                ", huijinmoneysl='" + huijinmoneysl + '\'' +
                ", huijindate='" + huijindate + '\'' +
                ", huijinip='" + huijinip + '\'' +
                '}';
    }
}
