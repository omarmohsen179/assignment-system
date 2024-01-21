package com.example.systemDesign.service.assessment;

import com.example.systemDesign.dto.AssessmentAnswerDTO;
import com.example.systemDesign.dto.AssessmentQuestionDTO;
import com.example.systemDesign.model.Assessment;
import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentQuestion;

import java.util.List;


public interface IAssessmentService {

    Assessment saveAssessment(Assessment assessment);
    List<Assessment> getAllAssessments();
    List<AssessmentAnswer> saveAssessmentAnswer(List<AssessmentAnswerDTO> answersDto) ;
    List<AssessmentQuestion> saveAssessmentQuestions(List<AssessmentQuestionDTO> questionsDto) ;

}
