package br.com.bertolo.carstockapi.users.application.usecases;

import br.com.bertolo.carstockapi.users.application.services.CreateUserService;
import br.com.bertolo.carstockapi.users.application.services.GetUserByEmailService;
import br.com.bertolo.carstockapi.users.application.services.exceptions.UserAlreadyExistsException;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.ResponseUserDTO;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.UserDTOMapper;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {

    private final CreateUserService createUserService;
    private final GetUserByEmailService getUserByEmailService;

    public CreateUserUseCase(CreateUserService createUserService, GetUserByEmailService getUserByEmailService) {
        this.createUserService = createUserService;
        this.getUserByEmailService = getUserByEmailService;
    }

    public User execute(User user) {
        if(this.getUserByEmailService.existUserByEmail(user.getEmail())) {
            throw new UserAlreadyExistsException("O e-mail " + user.getEmail() + " já existe no sistema!");
        }
        return this.createUserService.createUser(user);
    }
}
