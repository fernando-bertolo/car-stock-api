package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import br.com.bertolo.carstockapi.users.domain.entities.User;

import java.util.UUID;

public class UserEntityMapper {
    public static UserEntity toEntity(User user) {
        return new UserEntity(
                user.getNome(),
                user.getEmail(),
                user.getSenha(),
                1
        );
    }

    public static User toDomain(UserEntity user) {
        return new User(
                user.getNome(),
                user.getEmail(),
                user.getSenha(),
                user.getNivel_permissao()
        );
    }
}
