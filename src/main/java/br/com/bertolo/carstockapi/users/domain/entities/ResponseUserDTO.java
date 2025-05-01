package br.com.bertolo.carstockapi.users.domain.entities;

import java.util.UUID;

public record ResponseUserDTO(UUID id, String nome, String email, int nivel_permissao) {
}
