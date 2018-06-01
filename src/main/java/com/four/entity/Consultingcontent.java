package com.four.entity;

import java.io.Serializable;

public class Consultingcontent implements Serializable{


    private static final long serialVersionUID = 6088504323558491324L;
    //咨询内容
    private Integer id;
    private String name;
    private Integer pid;
    private Integer xuaho;
    private Integer fanshi;
    private String weizhi;
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getXuaho() {
        return xuaho;
    }

    public void setXuaho(Integer xuaho) {
        this.xuaho = xuaho;
    }

    public Integer getFanshi() {
        return fanshi;
    }

    public void setFanshi(Integer fanshi) {
        this.fanshi = fanshi;
    }

    public String getWeizhi() {
        return weizhi;
    }

    public void setWeizhi(String weizhi) {
        this.weizhi = weizhi;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }


    @Override
    public String toString() {
        return "Consultingcontent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", xuaho='" + xuaho + '\'' +
                ", fanshi=" + fanshi +
                ", weizhi='" + weizhi + '\'' +
                ", createdate='" + createdate + '\'' +
                '}';
    }
}
