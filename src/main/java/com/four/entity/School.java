package com.four.entity;

import java.io.Serializable;

public class School implements Serializable {
    private static final long serialVersionUID = -8964634604273803991L;
    //学校
    private Integer id;
    private String name;
    private Integer xuhao;
    private String createdate;
    private String pid;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedate() {
        return createdate;
    }

    public String getPid() {
        return pid;
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

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }
}
