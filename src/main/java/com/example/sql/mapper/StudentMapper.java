package com.example.sql.mapper;

import com.example.sql.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface StudentMapper {
    List<Student> select(@Param("studentId")Long id);

    Integer delete(@Param("idd")Long id);

    Integer update(Student student);

    Integer insert(Student student);

    List<Student> sele(Student student);



}
