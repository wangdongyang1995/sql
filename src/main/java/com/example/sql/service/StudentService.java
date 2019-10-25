package com.example.sql.service;

import com.example.sql.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> select(Long id);

    Integer delete(Long id);

    Integer update (Student student);

    Integer insert(Student student);

    List<Student> sele(Student student);


}
