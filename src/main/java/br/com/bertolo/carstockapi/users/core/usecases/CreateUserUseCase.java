package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.exceptions.EmailAlreadyExistException;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;

import java.util.Optional;

public class CreateUserUseCase implements UseCase<User, User> {

    private final UserGateway userGateway;

    public CreateUserUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        Optional<User> userDomain = this.userGateway.findByEmail(user.getEmail());
        if (userDomain.isPresent()) {
            throw new EmailAlreadyExistException("E-mail já cadastrado no sistema");
        }

        return this.userGateway.createUser(user);
    }
}
