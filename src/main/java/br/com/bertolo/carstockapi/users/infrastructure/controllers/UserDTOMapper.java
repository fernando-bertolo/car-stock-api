package br.com.bertolo.carstockapi.users.infrastructure.controllers;

import br.com.bertolo.carstockapi.users.domain.entities.User;

public class UserDTOMapper {
    static User toDomain(RequestUserDTO user) {
        return new User(user.nome(), user.email(), user.senha(), user.nivel_permissao());
    }

    static ResponseUserDTO toResponseDTO(User user) {
        return new ResponseUserDTO(user.getNome(), user.getEmail());
    }
}
