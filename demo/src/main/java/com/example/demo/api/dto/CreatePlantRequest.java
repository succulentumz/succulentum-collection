package com.example.demo.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Value;
import lombok.NonNull;
import org.hibernate.type.descriptor.jdbc.TimestampWithTimeZoneJdbcType;

@Builder
@Value
public final class CreatePlantRequest {

    private int id;

    @NonNull
    private int folderId;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotBlank
    private String location;

    @NonNull
    private TimestampWithTimeZoneJdbcType addedAt;

    private TimestampWithTimeZoneJdbcType removedAt;

    @NonNull
    private boolean isDead;

    private String deathLocation;

    private TimestampWithTimeZoneJdbcType deathTime;

    private String deathCause;
}
