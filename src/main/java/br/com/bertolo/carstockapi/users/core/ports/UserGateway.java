package br.com.bertolo.carstockapi.users.core.ports;

import br.com.bertolo.carstockapi.users.core.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserGateway {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    Void deleteById(Long id);
}
