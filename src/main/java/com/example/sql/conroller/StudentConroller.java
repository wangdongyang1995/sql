package com.example.sql.conroller;


import com.example.sql.entity.Student;
import com.example.sql.service.StudentService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;
//测试提交
import java.util.List;

@RestController
@RequestMapping("/api")
@Api(tags = "查询")
public class StudentConroller {
    private final StudentService studentService;

    public StudentConroller(StudentService studentService) {
        this.studentService = studentService;
    }






    /**
     * 获取学生列表
     * */
    @PostMapping("student")
    @ApiOperation(value = "获取学生列表")
    public List<Student> sele(Student student){

        return  studentService.sele(student);
    }


    @PostMapping("liangge")
    @ApiOperation(value = "两个参数")
    List<Student> sel(@RequestParam("id")Long id,@RequestParam("name")String name) {
        return studentService.select(id,name);
    }



    @GetMapping("update")
    @ApiOperation(value = "更新学生")
    Integer upd(Student student){

        return studentService.update(student);
    }

    @GetMapping("inster")
    @ApiOperation(value = "插入")
    Integer inster(Student student){

        return studentService.insert(student);
    }





    @GetMapping("delete")
    @ApiOperation(value = "删除学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    })
    String del(@RequestParam("id")Long id){
        int type =  studentService.delete(id);
        String re="";
        if (type==1){
            re="删除成功";
        }else {
            re="删除失败";
        }
        return re;
    }












//    @Autowired
//    @Resource
//    StudentService studentService;
//    @Resource
//    TeacherService teacherService;
//
//    @RequestMapping("/teaselect")
//    List<Teacher> select(Teacher teacher){
//        return teacherService.select(teacher);
//    }
//
//    @RequestMapping ("/teasele")
//    List<Teacher> sele(Teacher teacher){
//        return teacherService.sele(teacher);
//    }
//
//
//    @RequestMapping("/sel")
//    List<Student> sel(@RequestParam("id")Long id) {
//        return studentService.select(id);
//    }
//
//
//    @RequestMapping("/del")
//    String del(@RequestParam("id")Long id){
//        int type =  studentService.delete(id);
//        String re="";
//        if (type==1){
//            re="删除成功";
//        }else {
//            re="删除失败";
//        }
//        return re;
//    }
//
//    @RequestMapping("/upd")
//    Integer upd(Student student){
//
//        return studentService.update(student);
//    }
//
//    @RequestMapping("/ins")
//    Integer ins(Student student){
//
//        return  studentService.insert(student);
//    }
//
//
//    @RequestMapping("/sele")
//    List<Student> sele(Student student){
//
//        return  studentService.sele(student);
//    }



}
