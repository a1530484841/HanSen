package com.aaa.springboot170104.mapper;

import com.aaa.springboot170104.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    //查询所有的方法
    public List<Student> findAll();
    //删除方法
    public  int dele(int s_id);
    //添加方法
     public  int add(Student student);
    //修改方法

    public int update(Student student);
}
