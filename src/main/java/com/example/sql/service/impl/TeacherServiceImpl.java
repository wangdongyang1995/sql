package com.example.sql.service.impl;

import com.example.sql.entity.Teacher;
import com.example.sql.mapper.TeacherMapper;
import com.example.sql.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> select(Teacher teacher) {
        return teacherMapper.select(teacher);
    }

    @Override
    public List<Teacher> sele(Teacher teacher) {
        return teacherMapper.sele(teacher);
    }
}
