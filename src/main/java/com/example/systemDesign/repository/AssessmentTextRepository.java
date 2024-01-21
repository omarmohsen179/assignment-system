package com.example.systemDesign.repository;

import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentTextRepository extends JpaRepository<AssessmentText, Long> {
}
