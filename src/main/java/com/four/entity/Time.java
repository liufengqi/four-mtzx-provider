package com.four.entity;

import java.io.Serializable;

public class Time implements Serializable{

    private static final long serialVersionUID = 2789370519275238498L;
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
