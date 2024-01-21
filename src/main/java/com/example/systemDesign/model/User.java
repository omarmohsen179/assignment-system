package com.example.systemDesign.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID apiKey;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isBanned;
    private Boolean isVerified;
    private UUID confirmCode;
    private LocalDateTime confirmedAt;
    private LocalDateTime passwordChangedAt;
    private String displayName;
    private String userUrl;
    private Boolean isLdap;
    private Long createdBy;
    private Long updatedBy;
    private String rememberToken;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String otp;
    private LocalDateTime otpCreatedAt;
    private Long profilePictureId;

    // Other fields, getters, and setters
}