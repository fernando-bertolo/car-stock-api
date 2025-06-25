package br.com.bertolo.carstockapi.users.config;

import br.com.bertolo.carstockapi.users.core.ports.UserGateway;
import br.com.bertolo.carstockapi.users.core.usecases.CreateUserUseCase;
import br.com.bertolo.carstockapi.users.core.usecases.GetAllUserUseCase;
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
}