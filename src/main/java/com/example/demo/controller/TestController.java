package com.example.demo.controller;

import com.example.demo.domain.Admin;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import com.example.demo.service.AdminService;
import com.example.demo.service.GradeService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {
//    @Autowired
//    PrimaryService primaryService;
//    @Autowired
//    SecondaryService secondaryService;
    @Autowired
    StudentService studentService;
    @Autowired
    GradeService gradeService;
    @Autowired
    AdminService adminService;

    @RequestMapping("/")
    public String loginUI(){
        return "login";
    }
    @RequestMapping("/successed_UI")
    public String success_UI(){
        return "successed";
    }
    /*管理员登录*/
    @RequestMapping("/login")
    public String login(Admin admin1, Model model){
        Admin admin=adminService.Login(admin1);
        if (admin!=null){

            return "successed";
        }else {
            model.addAttribute("msg","用户名或密码错误！");
            return "msg";
        }


    }
    /*学生成绩部分*/
    @RequestMapping("/findAllGrade")
    public String findAllGrade(Grade grade,Model model){
        List<Grade>list=gradeService.findAll();
        model.addAttribute("list",list);
        return "grades_list";
    }
    @RequestMapping("/addGradeUI")
    public String addGradeUI(Model model){
        List<Student>list=studentService.findAll();
        model.addAttribute("st",list);

        return "add_grades";
    }
    @RequestMapping("/addGrade")
    public String addGrade(Model model,Grade grade){
        gradeService.addGrade(grade);
        model.addAttribute("msg","成绩信息添加成功！");
        model.addAttribute("html","/findAllGrade");
        return "msg2";
    }
    @RequestMapping("/editGradeUI")
    public String editGradeUI(int gid,Model model){
        Grade grade=gradeService.findByGid(gid);
        model.addAttribute("grade",grade);
        return "edit_grades";
    }
    @RequestMapping("/editGrade")
    public String editGrade(Grade grade,Model model){
        gradeService.editGrade(grade);
        model.addAttribute("msg","成绩信息修改成功！");
        model.addAttribute("html","/findAllGrade");
        return "msg2";
    }
    @RequestMapping("/deleteGrade")
    public String deleteGrade(int gid,Model model){
        gradeService.deleteGrade(gid);
        model.addAttribute("msg","成绩信息删除成功！");
        model.addAttribute("html","/findAllGrade");
        return "msg2";
    }


    /*学生信息部分*/
    @RequestMapping("/findAllStudent")
    public  String findAllStudent(Model model){
        List<Student> list=studentService.findAll();
        model.addAttribute("list",list);
        return "student_list";
    }
    @RequestMapping("/addStudentUI")
    public String addStudentUI(){
        return "add_student";
    }
    @RequestMapping("/addStudent")
    public String addStudent(Student student,Model model){
        studentService.AddStudent(student);
        model.addAttribute("msg","学生信息添加成功！");
        model.addAttribute("html","/findAllStudent");
        return "msg2";
    }
    @RequestMapping("/deleteStudent")
    public String deleteStudent(int sid,Model model){
        studentService.deleteStudent(sid);
        model.addAttribute("msg","学生信息删除成功！");
        model.addAttribute("html","/findAllStudent");
        return "msg2";
    }
    @RequestMapping("/editStudentUI")
    public String editStudentUI(int sid,Model model){
        Student student=studentService.findBySid(sid);
        model.addAttribute("student",student);
        return "edit_student";
    }
    @RequestMapping("/editStudent")
    public String editStudent(Student student,Model model){
        studentService.editStudent(student);
        model.addAttribute("msg","学生信息修改成功！");
        model.addAttribute("html","/findAllStudent");
        return "msg2";
    }



}
