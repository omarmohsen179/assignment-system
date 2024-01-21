package com.example.systemDesign.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isBanned;
    private Boolean isVerified;
    private String displayName;
    private String userUrl;
    private Boolean isLdap;

}