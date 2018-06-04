package com.four.entity;

import java.io.Serializable;

public class Jine implements Serializable{
    private static final long serialVersionUID = -3879444567988439499L;
    private Integer id;

    private Integer jinid;

    private Integer jinnumber;

    private String jindis;

    private String jindate;

    private String jinip;

    @Override
    public String toString() {
        return "Jine{" +
                "id=" + id +
                ", jinid=" + jinid +
                ", jinnumber=" + jinnumber +
                ", jindis='" + jindis + '\'' +
                ", jindate='" + jindate + '\'' +
                ", jinip='" + jinip + '\'' +
                '}';
    }

    public Integer getJinid() {
        return jinid;
    }

    public void setJinid(Integer jinid) {
        this.jinid = jinid;
    }

    public Integer getJinnumber() {
        return jinnumber;
    }

    public void setJinnumber(Integer jinnumber) {
        this.jinnumber = jinnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJindis() {
        return jindis;
    }

    public void setJindis(String jindis) {
        this.jindis = jindis == null ? null : jindis.trim();
    }

    public String getJindate() {
        return jindate;
    }

    public void setJindate(String jindate) {
        this.jindate = jindate == null ? null : jindate.trim();
    }

    public String getJinip() {
        return jinip;
    }

    public void setJinip(String jinip) {
        this.jinip = jinip == null ? null : jinip.trim();
    }
}