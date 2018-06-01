package com.four.entity;

import java.io.Serializable;

/**
 *
 */
//权限表
public class Jurisdiction implements Serializable{
    private static final long serialVersionUID = -6490208725315092757L;
    private  Integer qid;
    private  String qxname;
    private  Integer mkid;
    private  String mkname;
    private  Integer qxstru;
    public Integer getQid() {
        return qid;
    }
    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQxname() {
        return qxname;
    }

    public void setQxname(String qxname) {
        this.qxname = qxname;
    }

    public Integer getMkid() {
        return mkid;
    }

    public void setMkid(Integer mkid) {
        this.mkid = mkid;
    }

    public String getMkname() {
        return mkname;
    }

    public void setMkname(String mkname) {
        this.mkname = mkname;
    }

    public Integer getQxstru() {
        return qxstru;
    }

    public void setQxstru(Integer qxstru) {
        this.qxstru = qxstru;
    }

    @Override
    public String toString() {
        return "Jurisdiction{" +
                "qid=" + qid +
                ", qxname='" + qxname + '\'' +
                ", mkid=" + mkid +
                ", mkname='" + mkname + '\'' +
                ", qxstru=" + qxstru +
                '}';
    }
}
