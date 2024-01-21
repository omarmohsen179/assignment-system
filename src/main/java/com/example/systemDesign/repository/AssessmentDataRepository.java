package com.example.systemDesign.repository;

import com.example.systemDesign.model.AssessmentData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentDataRepository extends JpaRepository<AssessmentData, Long> {
}
