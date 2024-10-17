package com.example.demo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.time.OffsetDateTime;

@Builder
@Value
public final class UpdatePlantRequest {

    private int id;

    @NotNull
    private int folderId;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String location;

    @NotNull
    private OffsetDateTime addedAt;

    private OffsetDateTime removedAt;

    @NotNull
    private boolean isDead;

    private String deathLocation;

    private OffsetDateTime deathTime;

    private String deathCause;
}
