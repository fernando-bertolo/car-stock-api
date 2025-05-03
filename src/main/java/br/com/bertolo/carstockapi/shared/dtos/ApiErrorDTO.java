package br.com.bertolo.carstockapi.shared.dtos;

import java.time.LocalDateTime;

public record ApiErrorDTO(int statusCode, String message, LocalDateTime timestamp) {
}
