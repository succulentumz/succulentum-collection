package com.example.demo.api.dto;

import lombok.Builder;
import lombok.Value;

import java.sql.Timestamp;

@Builder
@Value
public class PlantResponse {
    private Long id;
    private Long folderId;
    private String name;
    private String description;
    private String location;
    private Timestamp addedAt;
    private Timestamp removedAt;
    private Boolean isDead;
    private String deathLocation;
    private Timestamp deathTime;
    private String deathCause;
}
