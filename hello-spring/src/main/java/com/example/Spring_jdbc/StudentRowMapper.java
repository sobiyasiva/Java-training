package com.example.Spring_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.NonNull;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(@NonNull ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setGrade(rs.getString("grade"));
        return student;
    }
}
