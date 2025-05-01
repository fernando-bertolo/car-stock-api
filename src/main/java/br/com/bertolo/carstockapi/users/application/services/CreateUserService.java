package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {
    public CreateUserService() {}

    public User createUser(User user) {
        return user;
    }
}
