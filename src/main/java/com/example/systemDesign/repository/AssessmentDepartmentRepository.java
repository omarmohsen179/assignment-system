package com.example.systemDesign.repository;

import com.example.systemDesign.model.AssessmentDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentDepartmentRepository extends JpaRepository<AssessmentDepartment, Long> {
}
