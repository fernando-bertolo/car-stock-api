package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntityMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateUserService {
    private static final Logger logger = LoggerFactory.getLogger(CreateUserService.class);

    private final UserRepository userRepository;
    public CreateUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User createUser(User user) {
        logger.info("Creating new user");
        var entity = UserEntityMapper.toEntity(user);
        System.out.println(entity);
        var userEntity = this.userRepository.save(UserEntityMapper.toEntity(user));
        return UserEntityMapper.toDomain(userEntity);
    }
}
