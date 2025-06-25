package br.com.bertolo.carstockapi.users.core.ports;

import br.com.bertolo.carstockapi.users.core.domain.User;

import java.util.List;

public interface UserGateway {
    User createUser(User user);
    List<User> getAllUsers();
}
