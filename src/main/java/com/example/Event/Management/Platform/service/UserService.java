package com.example.Event.Management.Platform.service;

import com.example.Event.Management.Platform.model.dto.UserRequestDto;
import com.example.Event.Management.Platform.model.dto.UserResponseDto;
import com.example.Event.Management.Platform.model.dto.UserUpdateDto;
import com.example.Event.Management.Platform.model.entity.User;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserRequestDto request);
    UserResponseDto getUserById (Long id);
    List<UserResponseDto> getAllUsers();
    void deleteUserById (Long id);
    UserResponseDto update(Long id, UserUpdateDto dto);

    default UserResponseDto toDto(User user){
        return new UserResponseDto(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword()
        );
    }
}
