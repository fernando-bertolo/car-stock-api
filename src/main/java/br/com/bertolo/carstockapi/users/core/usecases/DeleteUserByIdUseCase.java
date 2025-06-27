package br.com.bertolo.carstockapi.users.core.usecases;

import br.com.bertolo.carstockapi.shared.exceptions.ResourceNotFoundException;
import br.com.bertolo.carstockapi.shared.interfaces.UseCase;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.exceptions.EmailAlreadyExistException;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;
import org.springframework.web.client.ResourceAccessException;

import java.util.Optional;

public class DeleteUserByIdUseCase implements UseCase<Long, Void> {

    private final UserGateway userGateway;

    public DeleteUserByIdUseCase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Void execute(Long params) {
       this.userGateway.findById(params)
               .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));

        this.userGateway.deleteById(params);
        return null;
    }
}
