package com.example.systemDesign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "assessment_questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssessmentQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String question;

    @Column(name = "category_id")
    private Long categoryId;

    private Integer level;

    @Column(nullable = false, name = "order_question")
    private Integer order;

    @Column(columnDefinition = "text")
    private String type;
}
