package com.tpy.boothibernater.dao;

import com.tpy.boothibernater.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Component
public interface StudentMapperJpa extends JpaRepository<Student,Integer> {

    @Query(value = "select s.student_id ,s.student_name ,s.student_age  " +
            "from student_info s where student_name like concat('%',concat(?1,'%') )",nativeQuery=true)
    public List<Student> selectLikeStudentByName(String name);

    @Query(value = "select s.student_id,s.student_name,s.student_age " +
            "from student_info s where s.student_name = :name",nativeQuery = true)
    public Student selectStudentByName(@Param("name") String name);

    @Query(value = "select s.student_id,s.student_name,s.student_age " +
            "from student_info s",nativeQuery = true)
    public List<Student> selectByNamePageable(Pageable pageable);

}
