package com.example.systemDesign.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssessmentQuestionDTO {
    private Long id;
    private String question;
    private Long categoryId;
    private Integer level;
    private Integer order;
    private String type;
}
