package com.example.demo.domain;

import java.io.Serializable;
import java.sql.Date;

public class Student implements Serializable {
    private static final long serialVersionUID=-339516038496531943L;
    private String sno;//学生编号
    private String sname;//学生姓名
    private String ssex;//学生性别
    private Date sbirthday;//学生生日
    private String classno;//学生班级

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSno() {
        return sno;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSsex() {
        return ssex;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getClassno() {
        return classno;
    }
}
