package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.controllers.UserDTOMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntity;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserEntityMapper;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetUsersService {
    private final UserRepository userRepository;
    public GetUsersService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<UserEntity> usersEntity = this.userRepository.findAll();
        return usersEntity.stream()
                .map(UserEntityMapper::toDomain)
                .collect(Collectors.toList());

    }
}
