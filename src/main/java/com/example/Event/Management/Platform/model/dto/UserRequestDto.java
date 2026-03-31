package com.example.Event.Management.Platform.model.dto;

public record UserRequestDto(
    String username,
    String email,
    String password
) { }
