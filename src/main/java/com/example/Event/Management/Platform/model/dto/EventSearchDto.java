package com.example.Event.Management.Platform.model.dto;

import com.example.Event.Management.Platform.model.enums.EventCategory;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record EventSearchDto(
        String name,
        String city,
        EventCategory eventCategory,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime dateTime
) { }
