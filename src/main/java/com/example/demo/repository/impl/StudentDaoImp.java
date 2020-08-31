package com.example.demo.repository.impl;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
import java.util.Map;

@Repository("StudentDao")
public class StudentDaoImp implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Student student) {
        String sql = "insert into students(sno,sname,ssex,sbirthday,class) values(?,?,?,?,?)";
        Object[] args = {student.getSno(), student.getSname(), student.getSsex(), student.getSbirthday(), student.getClassno()};
        int[] argTypes = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.DATE, Types.VARCHAR};
        return this.jdbcTemplate.update(sql, args, argTypes);
        //String sql = "insert into students(sno,sname,ssex,sbirthday,class) values(:sno,:sname,:ssex,:sbirthday,:class)";
        //NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        //return npjt.update(sql, new BeanPropertySqlParameterSource(student));
    }

    @Override
    public int deleteBysno(String sno) {
        String sql = "delete from students where sno = ?";
        Object[] args = {sno};
        int[] argTypes = {Types.VARCHAR};
        return this.jdbcTemplate.update(sql, args, argTypes);
    }

    @Override
    public int update(Student student) {
        String sql = "update students set sname = ?,ssex = ? where sno = ?";
        Object[] args = {student.getSname(), student.getSsex(), student.getSno()};
        int[] argTypes = {Types.VARCHAR, Types.VARCHAR, Types.VARCHAR};
        return this.jdbcTemplate.update(sql, args, argTypes);
    }

    @Override
    public Map<String, Object> queryStudentBysno(String sno) {
        String sql = "select * from students where sno = ?";
        Object[] args = {sno};
        int[] argTypes = {Types.VARCHAR};
        //return this.jdbcTemplate.query(sql, args, argTypes,);
        List<Map<String, Object>> studentList = this.jdbcTemplate.queryForList(sql, args, argTypes);
        if(studentList != null && studentList.size() > 0){
            return studentList.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        String sql = "select * from students";
        return this.jdbcTemplate.queryForList(sql);
    }
}
