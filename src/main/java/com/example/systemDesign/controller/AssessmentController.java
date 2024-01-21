package com.example.systemDesign.controller;

import com.example.systemDesign.dto.All;
import com.example.systemDesign.dto.AssessmentAnswerDTO;
import com.example.systemDesign.dto.AssessmentQuestionDTO;
import com.example.systemDesign.model.Assessment;
import com.example.systemDesign.model.AssessmentAnswer;
import com.example.systemDesign.model.AssessmentQuestion;
import com.example.systemDesign.model.User;
import com.example.systemDesign.service.assessment.IAssessmentService;
import com.example.systemDesign.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/assessments")
@RequiredArgsConstructor
public class AssessmentController {

    private final IAssessmentService assessmentService;
    private final IUserService userService;
    private final ModelMapper modelMapper;

    @PostMapping("/save")
    public ResponseEntity<Assessment> saveAssessment(@RequestBody Assessment assessment) {
        Assessment savedAssessment = assessmentService.saveAssessment(assessment);
        return new ResponseEntity<>(savedAssessment, HttpStatus.CREATED);
    }

    //- Creating a POST endpoint to save assessment answers.
    @PostMapping("/save-answer")
    public ResponseEntity<List<AssessmentAnswer>> saveAssessmentAnswer(@RequestBody List<AssessmentAnswerDTO> answerDTO) {
        var savedAnswer = assessmentService.saveAssessmentAnswer(answerDTO);
        return new ResponseEntity<>(savedAnswer, HttpStatus.CREATED);
    }

    @PostMapping("/save-question")
    public ResponseEntity<List<AssessmentQuestion>> saveQuestionAnswer(@RequestBody List<AssessmentQuestionDTO> questionDTOS) {
        var saveQuestions = assessmentService.saveAssessmentQuestions(questionDTOS);
        return new ResponseEntity<>(saveQuestions, HttpStatus.CREATED);
    }

    @GetMapping("/all-in-one")
    public ResponseEntity<All> ALL() {
        User savedUser = userService.saveUser(User.builder().build());
        Assessment savedAssessment = assessmentService.saveAssessment(Assessment.builder().duration(1).published(Boolean.TRUE).build());
        var saveQuestions = assessmentService.saveAssessmentQuestions(new ArrayList<>(List.of(AssessmentQuestionDTO.builder().order(1).question("test").build())));
        var saveAnswers = assessmentService.saveAssessmentAnswer(new ArrayList<>(List.of(AssessmentAnswerDTO.builder().userId(savedUser.getId()).questionId(saveQuestions.get(0).getId()).answer("test 1").build())));
        return new ResponseEntity<>(new All(savedUser,savedAssessment,saveQuestions,saveAnswers), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Assessment>> getAllAssessments() {
        List<Assessment> assessments = assessmentService.getAllAssessments();
        return new ResponseEntity<>(assessments, HttpStatus.OK);
    }

}
