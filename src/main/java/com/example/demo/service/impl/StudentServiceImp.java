package com.example.demo.service.impl;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentDao;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("StudentService")
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return this.studentDao.add(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentDao.deleteBysno(sno);
    }

    @Override
    public int update(Student student) {
        return this.studentDao.update(student);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return this.studentDao.queryStudentListMap();
    }

    @Override
    public Map<String, Object> queryStudentBysno(String sno) {
        return this.studentDao.queryStudentBysno(sno);
    }

    public void print(){
        System.out.println("12312312");
    }
}
