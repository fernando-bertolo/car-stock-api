package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.domain.entities.User;
import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserByIdService {
    private static final Logger logger = LoggerFactory.getLogger(UpdateUserByIdService.class);

    private final UserRepository userRepository;
    public UpdateUserByIdService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void updateUserById(Long id, User user) {
//        this.userRepository.
    }
}
