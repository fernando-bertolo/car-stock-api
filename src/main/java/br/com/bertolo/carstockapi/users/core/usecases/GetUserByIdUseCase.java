package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;

import java.util.Optional;

public class GetUserByIdUseCase implements UseCase<Long, Optional<User>> {

    private final UserGateway userGateway;

    public GetUserByIdUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Optional<User> execute(Long params) {
        return this.userGateway.findById(params);
    }
}
