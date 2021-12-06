package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.Course;
import com.BansalSpring.SpringJpaPractice.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public  void SaveCourseMaterial(){
        Course course=Course.builder()
                .title(".net")
                .credit(6)
                .build();
        CourseMaterial courseMaterial=CourseMaterial.builder()
                .url("www.gggggoogle.com")
                 .course(course)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public void PrintAllCourseMaterial(){
        List<CourseMaterial> courseMaterial=courseMaterialRepository.findAll();
        System.out.println("courseMaterials =" + courseMaterial);
    }
}