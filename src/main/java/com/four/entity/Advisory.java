package com.four.entity;

import java.io.Serializable;

public class Advisory implements Serializable{

    private static final long serialVersionUID = 7525042587052155739L;
    //咨询父级分类
    private Integer id;
    private String name;
    private Integer xuhao;
    private Integer fanshi;
    private String createdate;

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
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

    public Integer getFanshi() {
        return fanshi;
    }

    public void setFanshi(Integer fanshi) {
        this.fanshi = fanshi;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }


    @Override
    public String toString() {
        return "Advisory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", fanshi=" + fanshi +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
