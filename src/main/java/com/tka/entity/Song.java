package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;

@Data  // Generates getters, setters, toString, equals, hashCode
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    @Id
    private String id;  // UUID will be set manually
    private String name;
    private String artist;
}
