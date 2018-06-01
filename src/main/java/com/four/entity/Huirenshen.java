package com.four.entity;

import java.io.Serializable;

public class Huirenshen implements Serializable  {

    private Integer huirenshenid;
    private String huirenshenstruts;
    private String huirenshenzh;
    private String huirenshensfz;
    private String huirenshenname;
    private String huirenshensfzh;
    private String huirenshenimgzhng;
    private String huirenshenimgfan;

    public Integer getHuirenshenid() {
        return huirenshenid;
    }

    public void setHuirenshenid(Integer huirenshenid) {
        this.huirenshenid = huirenshenid;
    }

    public String getHuirenshenstruts() {
        return huirenshenstruts;
    }

    public void setHuirenshenstruts(String huirenshenstruts) {
        this.huirenshenstruts = huirenshenstruts;
    }

    public String getHuirenshenzh() {
        return huirenshenzh;
    }

    public void setHuirenshenzh(String huirenshenzh) {
        this.huirenshenzh = huirenshenzh;
    }

    public String getHuirenshensfz() {
        return huirenshensfz;
    }

    public void setHuirenshensfz(String huirenshensfz) {
        this.huirenshensfz = huirenshensfz;
    }

    public String getHuirenshenname() {
        return huirenshenname;
    }

    public void setHuirenshenname(String huirenshenname) {
        this.huirenshenname = huirenshenname;
    }

    public String getHuirenshensfzh() {
        return huirenshensfzh;
    }

    public void setHuirenshensfzh(String huirenshensfzh) {
        this.huirenshensfzh = huirenshensfzh;
    }

    public String getHuirenshenimgzhng() {
        return huirenshenimgzhng;
    }

    public void setHuirenshenimgzhng(String huirenshenimgzhng) {
        this.huirenshenimgzhng = huirenshenimgzhng;
    }

    public String getHuirenshenimgfan() {
        return huirenshenimgfan;
    }

    public void setHuirenshenimgfan(String huirenshenimgfan) {
        this.huirenshenimgfan = huirenshenimgfan;
    }


    @Override
    public String toString() {
        return "Huirenshen{" +
                "huirenshenid=" + huirenshenid +
                ", huirenshenstruts='" + huirenshenstruts + '\'' +
                ", huirenshenzh='" + huirenshenzh + '\'' +
                ", huirenshensfz='" + huirenshensfz + '\'' +
                ", huirenshenname='" + huirenshenname + '\'' +
                ", huirenshensfzh='" + huirenshensfzh + '\'' +
                ", huirenshenimgzhng='" + huirenshenimgzhng + '\'' +
                ", huirenshenimgfan='" + huirenshenimgfan + '\'' +
                '}';
    }
}
