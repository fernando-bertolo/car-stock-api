package br.com.bertolo.carstockapi.cars.config;

import br.com.bertolo.carstockapi.cars.core.controller.CarController;
import br.com.bertolo.carstockapi.cars.core.gateway.CarGateway;
import br.com.bertolo.carstockapi.cars.core.usecase.CreateCarUsecase;
import br.com.bertolo.carstockapi.cars.core.usecase.CreateCarUsecaseImp;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DependencyInjectionConfiguration {

    private final CarGateway carGateway;

    @Bean
    public CreateCarUsecase createCarUsecase() {
        return new CreateCarUsecaseImp(carGateway);
    }

    @Bean
    public CarController carController(CreateCarUsecase createCarUsecase) {
        return new CarController(createCarUsecase);
    }

}
