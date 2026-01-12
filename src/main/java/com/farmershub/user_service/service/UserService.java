package com.farmershub.user_service.service;

import com.farmershub.user_service.dto.UserRequestDto;
import com.farmershub.user_service.dto.UserResponseDto;

public interface UserService {

    UserResponseDto registerUser(UserRequestDto userRequest);

    UserResponseDto getUserByEmail(String email);
}
