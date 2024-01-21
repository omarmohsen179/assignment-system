package com.example.systemDesign.repository;

import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentMatchRepository extends JpaRepository<AssessmentMatch, Long> {
}
