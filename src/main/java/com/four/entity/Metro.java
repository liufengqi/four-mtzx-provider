package com.four.entity;

import java.io.Serializable;

public class Metro implements Serializable{
    private static final long serialVersionUID = -8597285739954738447L;
    //地铁
    private Integer id;
    private String name;
    private Integer xuhao;
    private String createdate;

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

    @Override
    public String toString() {
        return "Metro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xuhao=" + xuhao +
                ", createdate='" + createdate + '\'' +
                '}';
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}
