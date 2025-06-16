package br.com.bertolo.carstockapi.veiculos.config;

import br.com.bertolo.carstockapi.veiculos.core.ports.VeiculoGateway;
import br.com.bertolo.carstockapi.veiculos.core.usecase.CreateVeiculoUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DependencyInjectionConfiguration {

    private final VeiculoGateway veiculoGateway;

    @Bean
    public CreateVeiculoUsecase createCarUsecase() {
        return new CreateVeiculoUsecase(veiculoGateway);
    }

    @Bean
    public VeiculoController carController(CreateVeiculoUsecase createVeiculoUsecase) {
        return new VeiculoController(createVeiculoUsecase);
    }

}
