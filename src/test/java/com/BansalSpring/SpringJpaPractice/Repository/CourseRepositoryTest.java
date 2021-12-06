package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.Course;
import com.BansalSpring.SpringJpaPractice.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourse(){
        List<Course> courses=courseRepository.findAll();
        System.out.println("courses=" + courses);
    }

    @Test
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Akshit")
                .lastName("Malik")
                .build();
        Course course=Course
                .builder()
                .title("Devops")
                .credit(4)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }


}