package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntityMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {

    private final UserRepository userRepository;
    public CreateUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        var userEntity =  this.userRepository.save(UserEntityMapper.toEntity(user));
        return UserEntityMapper.toDomain(userEntity);

    }
}
