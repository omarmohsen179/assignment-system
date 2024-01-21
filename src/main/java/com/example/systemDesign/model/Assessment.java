package com.example.systemDesign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "assessments")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "short_description", columnDefinition = "text")
    private String shortDescription;

    @Column(name = "description", columnDefinition = "text")
    private String description;

    @Column(name = "slug", length = 255)
    private String slug;

    @Column(name = "created_by")
    private Integer createdBy;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "thumbnail", length = 255)
    private String thumbnail;

    @Column(name = "published", nullable = false)
    private Boolean published;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedAt;
}
