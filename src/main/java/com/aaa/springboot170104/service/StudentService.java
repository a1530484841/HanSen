package com.aaa.springboot170104.service;

import com.aaa.springboot170104.entity.Student;
import com.aaa.springboot170104.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Resource
    StudentMapper dao;

    public List<Student> findAll(){
         return  dao.findAll();
    }
    public int dele(int s_id){
         return  dao.dele(s_id);
    }

   public  int add(Student student){
         return  dao.add(student);
   }

    public int update(Student student){
        return  dao.update(student);
    }
}
