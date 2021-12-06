package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
