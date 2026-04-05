package com.example.Event.Management.Platform.controller;

import com.example.Event.Management.Platform.model.dto.OrganizerRequestDto;
import com.example.Event.Management.Platform.model.dto.OrganizerResponseDto;
import com.example.Event.Management.Platform.model.dto.OrganizerUpdateDto;
import com.example.Event.Management.Platform.service.OrganizerService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizers")
@RequiredArgsConstructor
public class OrganizerController {
    private final OrganizerService service;

    @Operation(summary = "Save organizer in DB")
    @PostMapping
    public OrganizerResponseDto createOrganizer(@RequestBody OrganizerRequestDto dto){
        return service.createOrganizer(dto);
    }

    @Operation(summary = "Get organizer by id")
    @GetMapping("/{id}")
    public OrganizerResponseDto getOrganizerById(@PathVariable Long id){
        return service.getOrganizerById(id);
    }

    @Operation(summary = "Get all organizers")
    @GetMapping
    public List<OrganizerResponseDto> getAllOrganizers(){
        return service.getAllOrganizers();
    }

    @Operation(summary = "Update organizer")
    @PutMapping("/{id}")
    public OrganizerResponseDto update(@PathVariable Long id,@RequestBody OrganizerUpdateDto updateDto){
        return service.update(id, updateDto);
    }

    @Operation(summary = "Delete organizer")
    @DeleteMapping("/{id}")
    public void deleteOrganizerById(@PathVariable Long id){
        service.deleteOrganizerById(id);
    }
}
