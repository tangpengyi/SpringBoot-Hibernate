package com.tpy.boothibernater.service.impl;

import com.tpy.boothibernater.dao.StudentMapper;
import com.tpy.boothibernater.entity.Student;
import com.tpy.boothibernater.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public void insertStudent(Student student) {
        studentMapper.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return (List<Student>) studentMapper.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> student = studentMapper.findById(id);
        return student.get();
    }
}
