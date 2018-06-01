package com.four.entity;

public class Huiquan {

//会员管理会员权限表
    private int huiquanid;
    private String huiquanname;

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


    @Override
    public String toString() {
        return "Huiquan{" +
                "huiquanid=" + huiquanid +
                ", huiquanname='" + huiquanname + '\'' +
                '}';
    }
}
