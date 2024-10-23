package com.example.Spring_jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(String name, String grade) {
        Student student = new Student();
        student.setName(name);
        student.setGrade(grade);
        studentRepository.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void updateStudentGrade(int id, String newGrade) {
        studentRepository.updateStudentGrade(id, newGrade);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }
}
