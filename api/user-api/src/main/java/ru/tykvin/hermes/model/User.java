package ru.tykvin.hermes.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
public class User {
    @NonNull
    private final UUID id;
    @NonNull
    private final LocalDateTime createAt;
    @NonNull
    private final String ip;
}
