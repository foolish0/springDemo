package com.example.demo.repository;

import com.example.demo.domain.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    int add(Student student);
    int deleteBysno(String sno);
    int update(Student student);
    Map<String, Object> queryStudentBysno(String sno);
    List<Map<String,Object>> queryStudentListMap();

}
