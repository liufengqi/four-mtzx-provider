package com.four.entity;

import java.io.Serializable;

public class Member implements Serializable{
    private static final long serialVersionUID = -1554061681140926392L;
    //会员
    private Integer id;
    private String name;
    private String createdate;
    private String nianprice;
    private String shuacount;
    private String facount;
    private String paixu;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedate() {
        return createdate;
    }

    public String getNianprice() {
        return nianprice;
    }

    public String getShuacount() {
        return shuacount;
    }

    public String getFacount() {
        return facount;
    }

    public String getPaixu() {
        return paixu;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public void setNianprice(String nianprice) {
        this.nianprice = nianprice;
    }

    public void setShuacount(String shuacount) {
        this.shuacount = shuacount;
    }

    public void setFacount(String facount) {
        this.facount = facount;
    }

    public void setPaixu(String paixu) {
        this.paixu = paixu;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdate='" + createdate + '\'' +
                ", nianprice='" + nianprice + '\'' +
                ", shuacount='" + shuacount + '\'' +
                ", facount='" + facount + '\'' +
                ", paixu='" + paixu + '\'' +
                '}';
    }
}
