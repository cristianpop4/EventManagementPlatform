package com.example.Event.Management.Platform.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "event_organizers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "organizer_id")
public class EventOrganizer extends Person{

    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
    private Event event;
}
