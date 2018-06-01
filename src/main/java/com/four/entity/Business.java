package com.four.entity;

import java.io.Serializable;

public class Business implements Serializable{

    private static final long serialVersionUID = -1920086820272673627L;
    //s商圈
    private Integer id;
    private String name;
    private String guancount;
    private String createdate;
    private String areaid;
    private String photo;
    private String textarea;

    private String areaname;

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guancount='" + guancount + '\'' +
                ", createdate='" + createdate + '\'' +
                ", areaid='" + areaid + '\'' +
                ", photo='" + photo + '\'' +
                ", textarea='" + textarea + '\'' +
                ", areaname='" + areaname + '\'' +
                '}';
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

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

    public String getGuancount() {
        return guancount;
    }

    public void setGuancount(String guancount) {
        this.guancount = guancount;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }


}
