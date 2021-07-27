package com.example.demo.democode.entity;

import java.sql.Timestamp;

public class User {
    private String id;
    private String name;
    private String password;
    private Integer failTimes;
    private Boolean lockedFlag;
    private Timestamp lockedTime;

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

    public Boolean getLockedFlag() {
        return lockedFlag;
    }

    public Integer getFailTimes() {
        return failTimes;
    }

    public Timestamp getLockedTime() {
        return lockedTime;
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

    public void setFailTimes(Integer failTimes) {
        this.failTimes = failTimes;
    }

    public void setLockedFlag(Boolean lockedFlag) {
        this.lockedFlag = lockedFlag;
    }

    public void setLockedTime(Timestamp lockedTime) {
        this.lockedTime = lockedTime;
    }
}
