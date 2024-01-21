package com.example.systemDesign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "assessment_matchs")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssessmentMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "answer_id_key", length = 36, nullable = false)
    private String answerIdKey;

    @Column(name = "question_id_key", length = 36, nullable = false)
    private String questionIdKey;

    @Column(columnDefinition = "text")
    private String option;

    @Column(columnDefinition = "text")
    private String answer;

    @Column(nullable = false, name = "order_question")
    private Integer order;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "question_id", nullable = false, insertable = false, updatable = false)
    private Long questionId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private AssessmentQuestion question;
}