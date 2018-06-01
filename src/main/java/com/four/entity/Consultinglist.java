package com.four.entity;

import java.io.Serializable;

public class Consultinglist implements Serializable{

    private static final long serialVersionUID = -6310561242670089866L;
    //咨询
    private Integer id;
    private String name;
    private Integer zid;
    private String jiacu;
    private String color;
    private String author;
    private String laiyuan;
    private String wangzhi;
    private String photoimg;
    private String description;
    private String seozi;
    private String seodescription;
    private String createdate;
    private String dianlu;
    private Integer fanuhuiyuan;
    private Integer toutiao;
    private Integer shouye;
    private Integer shenhe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getJiacu() {
        return jiacu;
    }

    public void setJiacu(String jiacu) {
        this.jiacu = jiacu;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLaiyuan() {
        return laiyuan;
    }

    public void setLaiyuan(String laiyuan) {
        this.laiyuan = laiyuan;
    }

    public String getWangzhi() {
        return wangzhi;
    }

    public void setWangzhi(String wangzhi) {
        this.wangzhi = wangzhi;
    }

    public String getPhotoimg() {
        return photoimg;
    }

    public void setPhotoimg(String photoimg) {
        this.photoimg = photoimg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeozi() {
        return seozi;
    }

    public void setSeozi(String seozi) {
        this.seozi = seozi;
    }

    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getDianlu() {
        return dianlu;
    }

    public void setDianlu(String dianlu) {
        this.dianlu = dianlu;
    }

    public Integer getFanuhuiyuan() {
        return fanuhuiyuan;
    }

    public void setFanuhuiyuan(Integer fanuhuiyuan) {
        this.fanuhuiyuan = fanuhuiyuan;
    }

    public Integer getToutiao() {
        return toutiao;
    }

    public void setToutiao(Integer toutiao) {
        this.toutiao = toutiao;
    }

    public Integer getShouye() {
        return shouye;
    }

    public void setShouye(Integer shouye) {
        this.shouye = shouye;
    }

    public Integer getShenhe() {
        return shenhe;
    }

    public void setShenhe(Integer shenhe) {
        this.shenhe = shenhe;
    }


    @Override
    public String toString() {
        return "Consultinglist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zid=" + zid +
                ", jiacu='" + jiacu + '\'' +
                ", color='" + color + '\'' +
                ", author='" + author + '\'' +
                ", laiyuan='" + laiyuan + '\'' +
                ", wangzhi='" + wangzhi + '\'' +
                ", photoimg='" + photoimg + '\'' +
                ", description='" + description + '\'' +
                ", seozi='" + seozi + '\'' +
                ", seodescription='" + seodescription + '\'' +
                ", createdate='" + createdate + '\'' +
                ", dianlu='" + dianlu + '\'' +
                ", fanuhuiyuan=" + fanuhuiyuan +
                ", toutiao=" + toutiao +
                ", shouye=" + shouye +
                ", shenhe=" + shenhe +
                '}';
    }
}
