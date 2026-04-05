package com.example.Event.Management.Platform.model.dto;

import com.example.Event.Management.Platform.model.enums.EventCategory;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record EventResponseDto(
    Long id,
    String name,
    String description,
    EventCategory eventCategory,
    LocationResponseDto location,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime date,
    Integer maxParticipants,
    String organizerName
) { }
