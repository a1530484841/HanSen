package com.aaa.springboot170104.controller;

import com.aaa.springboot170104.entity.Student;
import com.aaa.springboot170104.service.StudentService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class StudentController {
    @Resource
    StudentService service;

     @RequestMapping("findAll")
      public  String findAll(Model model){
    List<Student> list=service.findAll();
      model.addAttribute("list",list);
     return "success";
      }

    @RequestMapping("dele")
    @ResponseBody
    public int dele(int s_id)
    {
        service.dele(s_id);
        return 1;
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Student student)
    {

        service.add(student);
        return 1;
    }


    @RequestMapping("update")
    @ResponseBody
    public int update(Student student)
    {

        service.update(student);
        return 1;
    }
}
