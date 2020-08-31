package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author lizhenjiang
 */
@RestController
public class UserController {
    /**
     * 简单理解为路由
     */
    @RequestMapping("/index")
    public String index() {
        return "Hello first Spring-boot application!";
    }

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student/addstudent", method = RequestMethod.GET)
    public int saveStudent(String sno, String sname, String ssex, Date sbirthday, String classno){
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(ssex);
        student.setSbirthday(sbirthday);
        student.setClassno(classno);
        return this.studentService.add(student);
    }

    @RequestMapping(value = "/student/updatestudent", method = RequestMethod.GET)
    public int updateStudent(String sno, String sname, String ssex){
        Student student = new Student();
        student.setSno(sno);
        student.setSname(sname);
        student.setSsex(ssex);
        return this.studentService.update(student);
    }

    @RequestMapping(value = "/student/deletestudent", method = RequestMethod.GET)
    public int deleteStudentBysno(String sno){
        return this.studentService.deleteBysno(sno);
    }

    @RequestMapping(value = "/student/querystudent", method = RequestMethod.GET)
    public Map<String, Object> queryStudentBysno(String sno){
        return this.studentService.queryStudentBysno(sno);
    }

    @RequestMapping(value = "/student/queryallstudent")
    public List<Map<String, Object>> queryAllStudent(){
        return this.studentService.queryStudentListMap();
    }
}
