package com.four.entity;

import java.io.Serializable;

public class t_fysh implements Serializable{
    private static final long serialVersionUID = -834197437804337075L;
    private Integer fyshztid;

    private String fyshzt;

    @Override
    public String toString() {
        return "t_fysh{" +
                "fyshztid=" + fyshztid +
                ", fyshzt='" + fyshzt + '\'' +
                '}';
    }

    public Integer getFyshztid() {
        return fyshztid;
    }

    public void setFyshztid(Integer fyshztid) {
        this.fyshztid = fyshztid;
    }

    public String getFyshzt() {
        return fyshzt;
    }

    public void setFyshzt(String fyshzt) {
        this.fyshzt = fyshzt == null ? null : fyshzt.trim();
    }
}