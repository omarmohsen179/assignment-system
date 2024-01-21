package com.example.systemDesign.dto;

import com.example.systemDesign.model.Assessment;
import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentQuestion;
import com.example.systemDesign.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class All {
    private User SavedUser;
    private Assessment SavedAssessment;
    private List<AssessmentQuestion> SaveQuestions;
    private List<AssessmentAnswer> SaveAnswers;
}
