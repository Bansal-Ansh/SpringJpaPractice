package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.Course;
import com.BansalSpring.SpringJpaPractice.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public  void saveTeacher(){

        Course courseJava=Course.builder()
                .title("Java")
                .credit(10)
                .build();
        Course courseSpring=Course.builder()
                .title("Spring")
                .credit(9)
                .build();

        Teacher teacher =Teacher.builder()
                .firstName("Nawaz")
                .lastName("Sharif")
                //.courses(List.of(courseJava,courseSpring))
                .build();
        teacherRepository.save(teacher);
    }
}