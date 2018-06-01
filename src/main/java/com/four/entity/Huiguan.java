package com.four.entity;

public class Huiguan {

   //会员管理管理员操作
    private Integer huiguanid;
    private String huiguanquanxian;
    private String huiguandengji;
    private String huiguandate;
    private String huiguanzhanghao;
    private Integer  huiguantuipai;
    private Integer  huiguandian;


    public Integer getHuiguanid() {
        return huiguanid;
    }

    public void setHuiguanid(Integer huiguanid) {
        this.huiguanid = huiguanid;
    }

    public String getHuiguanquanxian() {
        return huiguanquanxian;
    }

    public void setHuiguanquanxian(String huiguanquanxian) {
        this.huiguanquanxian = huiguanquanxian;
    }

    public String getHuiguandengji() {
        return huiguandengji;
    }

    public void setHuiguandengji(String huiguandengji) {
        this.huiguandengji = huiguandengji;
    }

    public String getHuiguandate() {
        return huiguandate;
    }

    public void setHuiguandate(String huiguandate) {
        this.huiguandate = huiguandate;
    }

    public String getHuiguanzhanghao() {
        return huiguanzhanghao;
    }

    public void setHuiguanzhanghao(String huiguanzhanghao) {
        this.huiguanzhanghao = huiguanzhanghao;
    }

    public Integer getHuiguantuipai() {
        return huiguantuipai;
    }

    public void setHuiguantuipai(Integer huiguantuipai) {
        this.huiguantuipai = huiguantuipai;
    }

    public Integer getHuiguandian() {
        return huiguandian;
    }

    public void setHuiguandian(Integer huiguandian) {
        this.huiguandian = huiguandian;
    }

    @Override
    public String toString() {
        return "Huiguan{" +
                "huiguanid=" + huiguanid +
                ", huiguanquanxian='" + huiguanquanxian + '\'' +
                ", huiguandengji='" + huiguandengji + '\'' +
                ", huiguandate='" + huiguandate + '\'' +
                ", huiguanzhanghao='" + huiguanzhanghao + '\'' +
                ", huiguantuipai=" + huiguantuipai +
                ", huiguandian=" + huiguandian +
                '}';
    }
}
