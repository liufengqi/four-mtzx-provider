package com.four.entity;

import java.io.Serializable;

public class Huiyyzz implements Serializable{

    private static final long serialVersionUID = -7303447766442146617L;
    //会员管理营业执照认证表
    private Integer huiyyzzid;
    private String huiyyzzrzzt;
    private String huiyyzzzzsh;
    private String huiyyzgsmc;
    private String huiyyzzzzhm;
    private String huiyyzzzz;

    public Integer getHuiyyzzid() {
        return huiyyzzid;
    }

    public void setHuiyyzzid(Integer huiyyzzid) {
        this.huiyyzzid = huiyyzzid;
    }

    public String getHuiyyzzrzzt() {
        return huiyyzzrzzt;
    }

    public void setHuiyyzzrzzt(String huiyyzzrzzt) {
        this.huiyyzzrzzt = huiyyzzrzzt;
    }

    public String getHuiyyzzzzsh() {
        return huiyyzzzzsh;
    }

    public void setHuiyyzzzzsh(String huiyyzzzzsh) {
        this.huiyyzzzzsh = huiyyzzzzsh;
    }

    public String getHuiyyzgsmc() {
        return huiyyzgsmc;
    }

    public void setHuiyyzgsmc(String huiyyzgsmc) {
        this.huiyyzgsmc = huiyyzgsmc;
    }

    public String getHuiyyzzzzhm() {
        return huiyyzzzzhm;
    }

    public void setHuiyyzzzzhm(String huiyyzzzzhm) {
        this.huiyyzzzzhm = huiyyzzzzhm;
    }

    public String getHuiyyzzzz() {
        return huiyyzzzz;
    }

    public void setHuiyyzzzz(String huiyyzzzz) {
        this.huiyyzzzz = huiyyzzzz;
    }


    @Override
    public String toString() {
        return "Huiyyzz{" +
                "huiyyzzid=" + huiyyzzid +
                ", huiyyzzrzzt='" + huiyyzzrzzt + '\'' +
                ", huiyyzzzzsh='" + huiyyzzzzsh + '\'' +
                ", huiyyzgsmc='" + huiyyzgsmc + '\'' +
                ", huiyyzzzzhm='" + huiyyzzzzhm + '\'' +
                ", huiyyzzzz='" + huiyyzzzz + '\'' +
                '}';
    }
}
