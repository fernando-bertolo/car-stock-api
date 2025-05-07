package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.application.services.exceptions.UserNotFoundException;
import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntity;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntityMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetUserByEmailService {

    private static final Logger logger = LoggerFactory.getLogger(GetUserByEmailService.class);

    private final UserRepository userRepository;
    public GetUserByEmailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> existUserByEmail(String email) {
        Optional<UserEntity> userEntity = this.userRepository.existsByEmail(email);
        return userEntity.map(UserEntityMapper::toDomain);
    }
}
