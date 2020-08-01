package com.example.demo.service.impl;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentDao;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lizhenjiang
 */
@Service("StudentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentDao.deleteBysno(sno);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return studentDao.queryStudentListMap();
    }

    @Override
    public Map<String, Object> queryStudentBysno(String sno) {
        return studentDao.queryStudentBysno(sno);
    }
}
