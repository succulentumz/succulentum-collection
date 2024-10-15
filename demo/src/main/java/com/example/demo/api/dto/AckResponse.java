package com.example.demo.api.dto;

public class AckResponse {
    private boolean acknowledged;

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
