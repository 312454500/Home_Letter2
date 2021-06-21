package com.bjpowernode.service;

import com.bjpowernode.pojo.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
