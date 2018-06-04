package com.four.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -3499674730034121183L;
    private Integer userid;
    private String username;
    private String userpass;
    private String name;
    private Integer zt;
    private String userphone;
    private String yanzhengma;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getYanzhengma() {
        return yanzhengma;
    }

    public void setYanzhengma(String yanzhengma) {
        this.yanzhengma = yanzhengma;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", name='" + name + '\'' +
                ", zt=" + zt +
                ", userphone='" + userphone + '\'' +
                ", yanzhengma='" + yanzhengma + '\'' +
                '}';
    }
}
