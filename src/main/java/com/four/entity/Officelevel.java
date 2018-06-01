package com.four.entity;

public class Officelevel {
    //写字楼级别
    private Integer id;
    private String name;
    private Integer xuhao;
    private String createdate;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Officelevel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
