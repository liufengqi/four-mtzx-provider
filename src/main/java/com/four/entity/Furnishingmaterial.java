package com.four.entity;

import java.io.Serializable;

public class Furnishingmaterial implements Serializable {

    private static final long serialVersionUID = 2730337571266204087L;
    //家装建材
    private Integer id;
    private String name;
    private Integer xuhao;
    private String createdate;
    private String photoimg;

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

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getPhotoimg() {
        return photoimg;
    }

    public void setPhotoimg(String photoimg) {
        this.photoimg = photoimg;
    }

    @Override
    public String toString() {
        return "Furnishingmaterial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                ", photoimg='" + photoimg + '\'' +
                '}';
    }
}
