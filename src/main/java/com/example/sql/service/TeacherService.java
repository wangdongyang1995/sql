package com.example.sql.service;

import com.example.sql.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> select(Teacher teacher);
    List<Teacher> sele(Teacher teacher);

}
