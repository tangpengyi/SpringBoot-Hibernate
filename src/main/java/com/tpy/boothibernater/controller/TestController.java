package com.tpy.boothibernater.controller;

import com.tpy.boothibernater.dao.StudentMapperJpa;
import com.tpy.boothibernater.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    private static int CurrentPage = 0;

    @Autowired
    private StudentMapperJpa mapperJpa;

    @RequestMapping("likeName")
    public List<Student> findStudentByLikeName(String name){

        return mapperJpa.selectLikeStudentByName(name);
    }

    @RequestMapping("findByName")
    public Student findStudentByName(String name){
        return mapperJpa.selectStudentByName(name);
    }

    @RequestMapping("selectPageable")
    public List<Student> findStudentByNamePageable(){
        Pageable page = PageRequest.of(CurrentPage++, 1, Sort.by("student_id"));
        return mapperJpa.selectByNamePageable(page);
    }

}
