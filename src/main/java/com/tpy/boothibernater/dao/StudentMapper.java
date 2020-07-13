package com.tpy.boothibernater.dao;

import com.tpy.boothibernater.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentMapper extends CrudRepository<Student, Integer> {
}
