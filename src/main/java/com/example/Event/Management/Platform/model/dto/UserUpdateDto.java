package com.example.Event.Management.Platform.model.dto;

public record UserUpdateDto(
        String username,
        String email,
        String password
) { }
