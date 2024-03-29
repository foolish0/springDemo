package com.example.demo.democode.service;

import com.example.demo.democode.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    int add(Student student);
    int deleteBysno(String sno);
    int update(Student student);
    List<Map<String, Object>> queryStudentListMap();
    Map<String, Object> queryStudentBysno(String sno);
}
