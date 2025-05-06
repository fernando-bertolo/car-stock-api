package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntity;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntityMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class GetUsersService {
    private final UserRepository userRepository;
    public GetUsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Page<User> getAllUsers(Pageable pageable) {
        Page<UserEntity> usersEntity = this.userRepository.findAll(pageable);
        return usersEntity.map(UserEntityMapper::toDomain);
    }
}
