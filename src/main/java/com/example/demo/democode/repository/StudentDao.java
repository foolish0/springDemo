package com.example.demo.democode.repository;

import com.example.demo.democode.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author lizhenjiang
 */
public interface StudentDao {
    int add(Student student);
    int deleteBysno(String sno);
    int update(Student student);
    Map<String, Object> queryStudentBysno(String sno);
    List<Map<String,Object>> queryStudentListMap();

}
