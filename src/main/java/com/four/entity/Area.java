package com.four.entity;

import java.io.Serializable;

public class Area implements Serializable{


    private static final long serialVersionUID = 8298740350905801986L;
    //区域
    private Integer id;
    private String name;
    private String pid;
    private Integer xuhao;
    private String createdate;
    private String shouzimu;
    private String zuobiao;
    private Integer hotstatus;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
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

    public String getShouzimu() {
        return shouzimu;
    }

    public void setShouzimu(String shouzimu) {
        this.shouzimu = shouzimu;
    }

    public String getZuobiao() {
        return zuobiao;
    }

    public void setZuobiao(String zuobiao) {
        this.zuobiao = zuobiao;
    }

    public Integer getHotstatus() {
        return hotstatus;
    }

    public void setHotstatus(Integer hotstatus) {
        this.hotstatus = hotstatus;
    }


    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                ", shouzimu='" + shouzimu + '\'' +
                ", zuobiao='" + zuobiao + '\'' +
                ", hotstatus=" + hotstatus +
                '}';
    }
}
