package br.com.bertolo.carstockapi.users.adapters.outbound;

import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.UserEntity;
import br.com.bertolo.carstockapi.users.adapters.outbound.database.jpa.repositories.UserRepository;
import br.com.bertolo.carstockapi.users.adapters.outbound.mappers.UserEntityMapper;
import br.com.bertolo.carstockapi.users.core.domain.User;
import br.com.bertolo.carstockapi.users.core.ports.UserGateway;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserGatewayAdapter implements UserGateway {

    private final UserRepository userRepository;

    public UserGatewayAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = this.userRepository.save(UserEntityMapper.toEntity(user));
        return User.createFromDb(userEntity.getId(), userEntity.getName(), userEntity.getEmail(), userEntity.getPassword());
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository
                .findAll()
                .stream()
                .map(user -> User.createFromDb(user.getId(), user.getName(), user.getEmail(), user.getPassword()))
                .collect(Collectors.toList());
    }
}
