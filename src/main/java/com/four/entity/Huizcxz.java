package com.four.entity;

public class Huizcxz {


    //会员管理注册性质
    private Integer huizcxzid;
    private String huizcxzname;

    public Integer getHuizcxzid() {
        return huizcxzid;
    }

    public void setHuizcxzid(Integer huizcxzid) {
        this.huizcxzid = huizcxzid;
    }

    public String getHuizcxzname() {
        return huizcxzname;
    }

    public void setHuizcxzname(String huizcxzname) {
        this.huizcxzname = huizcxzname;
    }


    @Override
    public String toString() {
        return "Huizcxz{" +
                "huizcxzid=" + huizcxzid +
                ", huizcxzname='" + huizcxzname + '\'' +
                '}';
    }
}
