package com.four.entity;

import java.io.Serializable;

public class Esfjgzs implements Serializable{

    private static final long serialVersionUID = -8809337066583869058L;
    private Integer id;
    private String estime;
    private String esypm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstime() {
        return estime;
    }

    public void setEstime(String estime) {
        this.estime = estime;
    }

    public String getEsypm() {
        return esypm;
    }

    public void setEsypm(String esypm) {
        this.esypm = esypm;
    }

    @Override
    public String toString() {
        return "Esfjgzs{" +
                "id=" + id +
                ", estime='" + estime + '\'' +
                ", esypm='" + esypm + '\'' +
                '}';
    }
}
