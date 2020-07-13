package com.tpy.boothibernater.service;

import com.tpy.boothibernater.entity.Student;

import java.util.List;

public interface StudentService {
    /**
     * 添加
     */
    void insertStudent(Student student);

    /**
     * 删除
     */
    void deleteStudent(int id);

    /**
     * 修改
     */
    void updateStudent(Student student);

    /**
     * 查询
     */
    List<Student> getStudent();

    /**
     * 查询单个
     */
    Student getStudentById(int id);

}
