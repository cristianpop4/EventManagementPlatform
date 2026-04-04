package com.example.Event.Management.Platform.controller;

import com.example.Event.Management.Platform.model.dto.UserRequestDto;
import com.example.Event.Management.Platform.model.dto.UserResponseDto;
import com.example.Event.Management.Platform.model.dto.UserUpdateDto;
import com.example.Event.Management.Platform.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @Operation(summary = "Save user in DB")
    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto dto) {
        return service.createUser(dto);
    }

    @Operation(summary = "Get user by id")
    @GetMapping("{id}")
    public UserResponseDto getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @Operation(summary = "Get all users")
    @GetMapping
    public List<UserResponseDto> getAllUsers(){
        return service.getAllUsers();
    }

    @Operation(summary = "Update user")
    @PutMapping("{id}")
    public UserResponseDto update(@PathVariable Long id, @RequestBody UserUpdateDto dto){
        return service.update(id, dto);
    }

    @Operation(summary = "Delete user")
    @DeleteMapping("{id}")
    public void deleteUserById (@PathVariable Long id){
        service.deleteUserById(id);
    }

}
