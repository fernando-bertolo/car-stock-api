package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.shared.interfaces.UseCaseNotParam;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;

import java.util.List;
import java.util.Optional;

public class GetUserByEmailUseCase implements UseCase<String, Optional<User>> {

    private final UserGateway userGateway;

    public GetUserByEmailUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Optional<User> execute(String params) {
        return this.userGateway.findByEmail(params);
    }
}
