package com.example.systemDesign.service.assessment;

import com.example.systemDesign.dto.AssessmentAnswerDTO;
import com.example.systemDesign.dto.AssessmentQuestionDTO;
import com.example.systemDesign.model.Assessment;
import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentQuestion;
import com.example.systemDesign.model.AssessmentQuestionsRelation;
import com.example.systemDesign.repository.AssessmentAnswerRepository;
import com.example.systemDesign.repository.AssessmentQuestionRelationRepository;
import com.example.systemDesign.repository.AssessmentQuestionRepository;
import com.example.systemDesign.repository.AssessmentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AssessmentService implements IAssessmentService {

    private final AssessmentRepository assessmentRepository;
    private final AssessmentAnswerRepository answerRepository;
    private final AssessmentQuestionRepository assessmentQuestionRepository;
    private final AssessmentQuestionRelationRepository assessmentQuestionRelationRepository;
    private final ModelMapper modelMapper;

    @Override
    public Assessment saveAssessment(Assessment assessment) {
        return assessmentRepository.save(assessment);
    }

    @Override
    public List<Assessment> getAllAssessments() {
        return assessmentRepository.findAll();
    }

    private int calculateScore(AssessmentAnswer answer) {
        // score Logic
        return 10;
    }

    @Override
    public List<AssessmentAnswer> saveAssessmentAnswer(List<AssessmentAnswerDTO> answersDto) {
        List<AssessmentAnswer> assessmentAnswer = answersDto.stream().map(e -> {
            var temp = modelMapper.map(e, AssessmentAnswer.class);
            temp.setQuestion(AssessmentQuestion.builder().id(e.getQuestionId()).build());
            temp.setScore(calculateScore(temp));
            temp.setCreatedAt(LocalDateTime.now());
            temp.setUpdatedAt(LocalDateTime.now());
            return temp;
        }).toList();
        return answerRepository.saveAll(assessmentAnswer);
    }

    @Override
    public List<AssessmentQuestion> saveAssessmentQuestions(List<AssessmentQuestionDTO> questionsDto){
        List<AssessmentQuestion> assessmentAnswer = questionsDto.stream().map(e -> modelMapper.map(e, AssessmentQuestion.class)).toList();
        return assessmentQuestionRepository.saveAll(assessmentAnswer);
    }
}
