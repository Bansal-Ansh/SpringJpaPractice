package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
