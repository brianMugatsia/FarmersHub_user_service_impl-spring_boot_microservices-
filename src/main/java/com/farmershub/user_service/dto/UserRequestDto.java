package com.farmershub.user_service.dto;

import lombok.Data;

@Data
public class UserRequestDto {
    private String fullName;
    private String email;
    private String password;
    private String role;
}
