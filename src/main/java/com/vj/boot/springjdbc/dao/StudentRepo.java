package com.vj.boot.springjdbc.dao;

import com.vj.boot.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Student student) {
        String query = "insert into student(roll_no,name,marks) values (?,?,?);";
        int rows = jdbcTemplate.update(query, student.getRollNo(), student.getName(), student.getMarks());
        System.out.println(rows + " rows affected...");
    }

    public List<Student> findAll() {
        String query = "select * from student;";
        return jdbcTemplate.query(query, (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("roll_no"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));
            return student;
        });
    }
}
