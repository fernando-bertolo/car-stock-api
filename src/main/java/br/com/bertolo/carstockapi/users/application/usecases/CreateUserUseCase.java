package br.com.bertolo.carstockapi.users.application.usecases;

import br.com.bertolo.carstockapi.users.application.services.CreateUserService;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.ResponseUserDTO;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.UserDTOMapper;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {

    private final CreateUserService createUserService;

    public CreateUserUseCase(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    public User execute(User user) {
        return this.createUserService.createUser(user);
    }
}
