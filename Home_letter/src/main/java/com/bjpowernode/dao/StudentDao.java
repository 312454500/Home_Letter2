package com.bjpowernode.dao;

import com.bjpowernode.pojo.Student;

import java.util.List;

public interface StudentDao {
    int insertStudent(Student student);
    List <Student> selectStudents();
}
