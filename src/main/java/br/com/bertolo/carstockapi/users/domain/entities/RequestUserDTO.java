package br.com.bertolo.carstockapi.users.domain.entities;

import java.util.UUID;

public record RequestUserDTO(UUID id, String nome, String email, String senha, int nivel_permissao) {
}
