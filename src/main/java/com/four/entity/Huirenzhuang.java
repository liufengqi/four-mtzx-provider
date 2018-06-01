package com.four.entity;

import java.io.Serializable;

public class Huirenzhuang implements Serializable {

    private static final long serialVersionUID = 7000902882539153602L;
    //会员管理认证状态
    private Integer huirenid;
    private String huirenztai;
    private Integer huishenid;
    private String huirenjjyy;
    private String huirenzsxm;
    private String huirensfzh;
    private String huirensfzzm;
    private String huirensfzfm;

    private String huijizhanghao;


    public Integer getHuirenid() {
        return huirenid;
    }

    public void setHuirenid(Integer huirenid) {
        this.huirenid = huirenid;
    }

    public String getHuirenztai() {
        return huirenztai;
    }

    public void setHuirenztai(String huirenztai) {
        this.huirenztai = huirenztai;
    }

    public Integer getHuishenid() {
        return huishenid;
    }

    public void setHuishenid(Integer huishenid) {
        this.huishenid = huishenid;
    }

    public String getHuirenjjyy() {
        return huirenjjyy;
    }

    public void setHuirenjjyy(String huirenjjyy) {
        this.huirenjjyy = huirenjjyy;
    }

    public String getHuirenzsxm() {
        return huirenzsxm;
    }

    public void setHuirenzsxm(String huirenzsxm) {
        this.huirenzsxm = huirenzsxm;
    }

    public String getHuirensfzh() {
        return huirensfzh;
    }

    public void setHuirensfzh(String huirensfzh) {
        this.huirensfzh = huirensfzh;
    }

    public String getHuirensfzzm() {
        return huirensfzzm;
    }

    public void setHuirensfzzm(String huirensfzzm) {
        this.huirensfzzm = huirensfzzm;
    }

    public String getHuirensfzfm() {
        return huirensfzfm;
    }

    public void setHuirensfzfm(String huirensfzfm) {
        this.huirensfzfm = huirensfzfm;
    }

    public String getHuijizhanghao() {
        return huijizhanghao;
    }

    public void setHuijizhanghao(String huijizhanghao) {
        this.huijizhanghao = huijizhanghao;
    }

    @Override
    public String toString() {
        return "Huirenzhuang{" +
                "huirenid=" + huirenid +
                ", huirenztai='" + huirenztai + '\'' +
                ", huishenid=" + huishenid +
                ", huirenjjyy='" + huirenjjyy + '\'' +
                ", huirenzsxm='" + huirenzsxm + '\'' +
                ", huirensfzh='" + huirensfzh + '\'' +
                ", huirensfzzm='" + huirensfzzm + '\'' +
                ", huirensfzfm='" + huirensfzfm + '\'' +
                ", huijizhanghao='" + huijizhanghao + '\'' +
                '}';
    }
}
