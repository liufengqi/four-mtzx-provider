package com.four.entity;

import java.io.Serializable;

public class Feature implements Serializable {


    private static final long serialVersionUID = -3495396893550653397L;
    //特色
    private Integer id;
    private String name;
    private String sell;
    private String rendout;
    private String programa;
    private Integer xuhao;
    private String createdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getRendout() {
        return rendout;
    }

    public void setRendout(String rendout) {
        this.rendout = rendout;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
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


    @Override
    public String toString() {
        return "Feature{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sell='" + sell + '\'' +
                ", rendout='" + rendout + '\'' +
                ", programa='" + programa + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
