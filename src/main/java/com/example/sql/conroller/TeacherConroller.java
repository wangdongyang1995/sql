package com.example.sql.conroller;


import com.example.sql.entity.Teacher;
import com.example.sql.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teaapi")
@Api(tags = "教师查询")
public class TeacherConroller {

    private final TeacherService teacherService;

    public TeacherConroller(TeacherService teacherService) {
        this.teacherService = teacherService;
    }



    @GetMapping("tea")
    @ApiOperation(value = "教师查询")
    List<Teacher> select(Teacher teacher){
        return teacherService.select(teacher);
   }
}
