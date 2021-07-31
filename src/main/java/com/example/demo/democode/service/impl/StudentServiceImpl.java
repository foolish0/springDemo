package com.example.demo.democode.service.impl;

import com.example.demo.democode.entity.Student;
import com.example.demo.democode.repository.StudentDao;
import com.example.demo.democode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author lizhenjiang
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

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
