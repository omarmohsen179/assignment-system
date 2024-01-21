package com.example.systemDesign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssessmentAnswerDTO {
    private Long assessmentId;
    private Long questionId;
    private String answer;
    private Long userId;
}
