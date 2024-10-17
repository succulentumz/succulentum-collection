package com.example.demo.api.dto;

import lombok.Getter;

@Getter
public final class AckResponse {
    private final boolean acknowledged;

    public AckResponse(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public static AckResponse makeDefault(boolean acknowledged) {
        return new AckResponse(acknowledged);
    }

    public boolean isAcknowledged() {
        return acknowledged;
    }
}
