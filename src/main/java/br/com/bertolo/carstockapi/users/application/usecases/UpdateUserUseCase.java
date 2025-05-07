package br.com.bertolo.carstockapi.users.application.usecases;

import br.com.bertolo.carstockapi.users.application.services.GetUserByEmailService;
import br.com.bertolo.carstockapi.users.application.services.UpdateUserByIdService;
import br.com.bertolo.carstockapi.users.application.services.exceptions.UserAlreadyExistsException;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UpdateUserUseCase {

    private final UpdateUserByIdService updateUserByIdService;
    private final GetUserByEmailService getUserByEmailService;

    public UpdateUserUseCase(
            UpdateUserByIdService updateUserByIdService,
            GetUserByEmailService getUserByEmailService
    ) {
        this.updateUserByIdService = updateUserByIdService;
        this.getUserByEmailService = getUserByEmailService;
    }

    public void execute(Long id, User user) {
        Optional<User> userDomain = this.getUserByEmailService.existUserByEmail(user.getEmail());

        if(userDomain.isPresent() && !userDomain.get().getId().equals(id)) {
            throw new UserAlreadyExistsException("Outro usuário já possuio este e-mail");
        }

        this.updateUserByIdService.updateUserById(id, user);
    }
}
