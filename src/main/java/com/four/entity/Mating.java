package com.four.entity;

import java.io.Serializable;

public class Mating implements Serializable {
    private static final long serialVersionUID = 5982558724954588008L;
    //物业配套
    private Integer id;
    private String name;
    private String sell;
    private String rentout;
    private Integer xuhao;
    private String createdate;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSell() {
        return sell;
    }

    public String getRentout() {
        return rentout;
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

    public void setSell(String sell) {
        this.sell = sell;
    }

    public void setRentout(String rentout) {
        this.rentout = rentout;
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
        return "Mating{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sell='" + sell + '\'' +
                ", rentout='" + rentout + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
