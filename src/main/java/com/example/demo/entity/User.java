package com.example.demo.entity;

import java.sql.Timestamp;

public class User {
    private String id;
    private String name;
    private String password;
    private Integer failtimes;
    private Boolean lockedflag;
    private Timestamp lockedtime;

    public User(){}

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getLockedflag() {
        return lockedflag;
    }

    public Integer getFailtimes() {
        return failtimes;
    }

    public Timestamp getLockedtime() {
        return lockedtime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFailtimes(Integer failtimes) {
        this.failtimes = failtimes;
    }

    public void setLockedflag(Boolean lockedflag) {
        this.lockedflag = lockedflag;
    }

    public void setLockedtime(Timestamp lockedtime) {
        this.lockedtime = lockedtime;
    }
}
