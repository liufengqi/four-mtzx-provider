package com.four.entity;

import java.io.Serializable;

public class Huiquan implements Serializable{

    private static final long serialVersionUID = -3911815537846096421L;
    //会员管理会员权限表
    private int huiquanid;
    private String huiquanname;
    private String huilei;

    @Override
    public String toString() {
        return "Huiquan{" +
                "huiquanid=" + huiquanid +
                ", huiquanname='" + huiquanname + '\'' +
                ", huilei='" + huilei + '\'' +
                '}';
    }

    public String getHuilei() {
        return huilei;
    }

    public void setHuilei(String huilei) {
        this.huilei = huilei;
    }

    public int getHuiquanid() {
        return huiquanid;
    }

    public void setHuiquanid(int huiquanid) {
        this.huiquanid = huiquanid;
    }

    public String getHuiquanname() {
        return huiquanname;
    }

    public void setHuiquanname(String huiquanname) {
        this.huiquanname = huiquanname;
    }


}
