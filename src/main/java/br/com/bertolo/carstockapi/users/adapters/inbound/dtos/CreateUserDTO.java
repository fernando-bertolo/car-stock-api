package br.com.bertolo.carstockapi.users.adapters.inbound.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

public record CreateUserDTO (
        String name,
        @Email(message = "E-mail inválido")
        String email,
        @Min(8)
        String password
){}
