package br.com.bertolo.carstockapi.users.adapters.outbound;

import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.UserEntity;
import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.repositories.UserRepository;
import br.com.bertolo.carstockapi.users.adapters.outbound.mappers.UserEntityMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;
import org.springframework.stereotype.Component;

@Component
public class UserGatewayAdapter implements UserGateway {

    private final UserRepository userRepository;

    public UserGatewayAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long createUser(User user) {
        UserEntity userId = this.userRepository.save(UserEntityMapper.toEntity(user));
        return userId.getId();
    }
}
