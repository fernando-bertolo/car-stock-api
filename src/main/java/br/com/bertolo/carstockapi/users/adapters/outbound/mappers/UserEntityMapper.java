package br.com.bertolo.carstockapi.users.adapters.outbound.mappers;

import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.UserEntity;
import br.com.bertolo.carstockapi.users.core.domain.User;

public class UserEntityMapper {
    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getName(), user.getEmail(), user.getPassword());
    }
}
