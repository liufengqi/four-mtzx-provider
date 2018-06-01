package com.four.entity;

import java.io.Serializable;

public class Groupcontent implements Serializable {
    private static final long serialVersionUID = 719346976738882586L;
    //建材分组内容
    private Integer id;
    private String name;
    private Integer pid;
    private Integer xuhao;
    private String createdate;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPid() {
        return pid;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Groupcontent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", xuhao='" + xuhao + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
