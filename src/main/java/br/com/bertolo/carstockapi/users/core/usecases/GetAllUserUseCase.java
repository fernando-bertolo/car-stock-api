package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;

import java.util.List;

public class GetAllUserUseCase implements UseCase<User, List<User>> {

    private final UserGateway userGateway;

    public GetAllUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public List<User> execute(User user) {
        return this.userGateway.getAllUsers();
    }
}
