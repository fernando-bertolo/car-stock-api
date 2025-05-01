package br.com.bertolo.carstockapi.users.infrastructure.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record RequestUserDTO(
        @NotNull
        String nome,
        @Email
        @NotNull
        String email,
        @NotNull
        String senha,
        @NotNull
        int nivel_permissao
) {
}
