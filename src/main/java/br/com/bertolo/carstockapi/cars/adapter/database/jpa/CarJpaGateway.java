package br.com.bertolo.carstockapi.cars.adapter.database.jpa;

import br.com.bertolo.carstockapi.cars.adapter.database.jpa.repository.CarRepository;
import br.com.bertolo.carstockapi.cars.core.domain.Car;
import br.com.bertolo.carstockapi.cars.core.gateway.CarGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CarJpaGateway implements CarGateway {

    private final CarRepository carRepository;

    @Override
    public Long store(Car car) {
        try {
            return this.carRepository.save();
        } catch (Exception e) {
            log.error("Error while storing car", e);
            throw new RuntimeException(e);
        }
    }
}
