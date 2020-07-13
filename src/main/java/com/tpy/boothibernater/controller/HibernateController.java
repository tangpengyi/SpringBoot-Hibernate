package com.tpy.boothibernater.controller;

import com.tpy.boothibernater.entity.Student;
import com.tpy.boothibernater.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hibernate")
public class HibernateController {

    @Autowired
    StudentService studentService;

    /**
     * 添加
     * @return
     */
    @RequestMapping("insert")
    public String insert(){
        Student student = new Student();
        student.setId(21);
        student.setAge(21);
        student.setName("77");
        studentService.insertStudent(student);
        return "SUCCESS";
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("delete")
    public String delete(int id){
        studentService.deleteStudent(id);
        return "SUCCESS";
    }

    /**
     * 修改
     * 修改跟添加调用的是同一个方法如果id相同就改变数据没有就创建数据
     * @param student
     * @return
     */
    @RequestMapping("update")
    public String update(Student student){
        studentService.updateStudent(student);
        return "SUCCESS";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("getStudent")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("studentId")
    public Student getStudentById(int id){
        return studentService.getStudentById(id);
    }


}
