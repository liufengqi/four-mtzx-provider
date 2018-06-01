package com.four.entity;

import java.io.Serializable;

public class Huiqu implements Serializable {

    private static final long serialVersionUID = -5723434743962392431L;
    //会员管理区域表
    private Integer huiquid;
    private String huiqushi;
    private Integer pid;

    public Integer getHuiquid() {
        return huiquid;
    }

    public void setHuiquid(Integer huiquid) {
        this.huiquid = huiquid;
    }

    public String getHuiqushi() {
        return huiqushi;
    }

    public void setHuiqushi(String huiqushi) {
        this.huiqushi = huiqushi;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }


    @Override
    public String toString() {
        return "Huiqu{" +
                "huiquid=" + huiquid +
                ", huiqushi='" + huiqushi + '\'' +
                ", pid=" + pid +
                '}';
    }
}
