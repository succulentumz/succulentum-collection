package com.example.demo.api.dto;

import lombok.Builder;
import lombok.Value;
import lombok.NonNull;

import java.sql.Timestamp;

@Builder
@Value
public class PlantResponse {
    @NonNull
    private Long id;
    @NonNull
    private Long folderId;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String location;
    @NonNull
    private Timestamp addedAt;
    @NonNull
    private Timestamp removedAt;
    @NonNull
    private Boolean isDead;
    @NonNull
    private String deathLocation;
    @NonNull
    private Timestamp deathTime;
    @NonNull
    private String deathCause;
}
