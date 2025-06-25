package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.users.adapters.inbound.dtos.CreateUserDTO;
import br.com.bertolo.carstockapi.users.adapters.inbound.mappers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;

public class CreateUserUseCase implements UseCase<User, User> {

    private final UserGateway userGateway;

    public CreateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        return this.userGateway.createUser(user);
    }
}
