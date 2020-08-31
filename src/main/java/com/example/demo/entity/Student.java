package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lizhenjiang
 */
public class Student implements Serializable {
    private static final long serialVersionUID=-339516038496531943L;
    /**
     * 学生编号
     */
    private String sno;
    /**
     * 学生姓名
     */
    private String sname;
    /**
     * 学生性别
     */
    private String ssex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 学生生日
     */
    private Date sbirthday;
    /**
     * 学生班级
     */
    private String classno;

    public Student(){}

    public Student(String sname, Integer age) {
        this.age = age;
        this.sname = sname;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
