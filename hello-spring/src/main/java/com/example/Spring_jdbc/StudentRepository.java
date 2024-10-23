package com.example.Spring_jdbc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addStudent(Student student) {
        String sql = "INSERT INTO students (name, grade) VALUES (?, ?)";
        return jdbcTemplate.update(sql, student.getName(), student.getGrade());
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM students";
        return jdbcTemplate.query(sql, new StudentRowMapper());
    }

    public int updateStudentGrade(int id, String newGrade) {
        String sql = "UPDATE students SET grade = ? WHERE id = ?";
        return jdbcTemplate.update(sql, newGrade, id);
    }

    public int deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
