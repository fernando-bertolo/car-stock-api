package br.com.bertolo.carstockapi.users.application.services;

import br.com.bertolo.carstockapi.users.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserByIdService {
    private final UserRepository userRepository;
    public DeleteUserByIdService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteUserById(Long id) {
        this.userRepository.deleteById(id);
    }
}
