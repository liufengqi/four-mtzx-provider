package com.four.entity;

import java.io.Serializable;

public class Apartment implements Serializable {

    private static final long serialVersionUID = -5111326784606333670L;
    //物业类型
    private int id;
    private String yuanname;
    private String zhanname;
    private Integer xuhao;
    private String xiaozu;
    private String statusup;
    private String photoimg;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYuanname() {
        return yuanname;
    }

    public void setYuanname(String yuanname) {
        this.yuanname = yuanname;
    }

    public String getZhanname() {
        return zhanname;
    }

    public void setZhanname(String zhanname) {
        this.zhanname = zhanname;
    }

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getXiaozu() {
        return xiaozu;
    }

    public void setXiaozu(String xiaozu) {
        this.xiaozu = xiaozu;
    }

    public String getStatusup() {
        return statusup;
    }

    public void setStatusup(String statusup) {
        this.statusup = statusup;
    }

    public String getPhotoimg() {
        return photoimg;
    }

    public void setPhotoimg(String photoimg) {
        this.photoimg = photoimg;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", yuanname='" + yuanname + '\'' +
                ", zhanname='" + zhanname + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", xiaozu='" + xiaozu + '\'' +
                ", statusup='" + statusup + '\'' +
                ", photoimg='" + photoimg + '\'' +
                '}';
    }
}
