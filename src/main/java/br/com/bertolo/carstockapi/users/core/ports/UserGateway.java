package br.com.bertolo.carstockapi.users.core.ports;

import br.com.bertolo.carstockapi.users.core.domain.User;

public interface UserGateway {
    User createUser(User user);
}
