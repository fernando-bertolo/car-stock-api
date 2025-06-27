package br.com.bertolo.carstockapi.users.config;

import br.com.bertolo.carstockapi.users.core.ports.UserGateway;
import br.com.bertolo.carstockapi.users.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCase(userGateway);
    }

    @Bean
    public GetAllUserUseCase getAllUserUseCase(UserGateway userGateway) {
        return new GetAllUserUseCase(userGateway);
    }

    @Bean
    public GetUserByEmailUseCase getUserByEmailUseCase(UserGateway userGateway) {
        return new GetUserByEmailUseCase(userGateway);
    }

    @Bean
    public GetUserByIdUseCase getUserByIdUseCase(UserGateway userGateway) {
        return new GetUserByIdUseCase(userGateway);
    }

    @Bean
    public DeleteUserByIdUseCase deleteUserByIdUseCase(UserGateway userGateway) {
        return new DeleteUserByIdUseCase(userGateway);
    }
}