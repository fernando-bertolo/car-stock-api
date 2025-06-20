package br.com.bertolo.carstockapi.users.core.ports;

import br.com.bertolo.carstockapi.users.core.domain.User;

public interface UserGateway {
    Long createUser(User user);
}
