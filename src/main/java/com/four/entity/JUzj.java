package com.four.entity;

import java.io.Serializable;

public class JUzj implements Serializable{
    private static final long serialVersionUID = 2202125952503178713L;
    private  Integer id;
    private  Integer userid;
    private  Integer qid;

    @Override
    public String toString() {
        return "JUzj{" +
                "id=" + id +
                ", userid=" + userid +
                ", qid=" + qid +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }
}
