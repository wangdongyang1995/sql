package com.example.sql.mapper;

import com.example.sql.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    List<Teacher> select(Teacher teacher);


    List<Teacher> sele(Teacher teacher);




}
