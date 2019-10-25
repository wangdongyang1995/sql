package com.example.sql.service.impl;

import com.example.sql.entity.Student;
import com.example.sql.mapper.StudentMapper;
import com.example.sql.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    @Override
    public List<Student> select(Long id) {
        return studentMapper.select(id);
    }

    @Override
    public Integer delete(Long id) {
        return studentMapper.delete(id);
    }


    @Override
    public Integer update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public Integer insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public List<Student> sele(Student student) {
        return studentMapper.sele(student);
    }


}
