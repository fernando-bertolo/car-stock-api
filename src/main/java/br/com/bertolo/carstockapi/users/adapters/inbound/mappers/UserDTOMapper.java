package br.com.bertolo.carstockapi.users.adapters.inbound.mappers;

import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.CreateUserDTO;
import br.com.bertolo.carstockapi.users.core.domain.User;

public class UserDTOMapper {
    public static User toDomain(CreateUserDTO user) {
        return new User(
                user.name(),
                user.email(),
                user.password()
        );
    }
}
