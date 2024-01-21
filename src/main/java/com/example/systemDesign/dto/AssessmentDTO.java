package com.example.systemDesign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssessmentDTO  {
    private String title;
    private String shortDescription;
    private String description;
    private String slug;
    private Integer duration;
    private Long categoryId;
    private String thumbnail;
    private Boolean published;
}
