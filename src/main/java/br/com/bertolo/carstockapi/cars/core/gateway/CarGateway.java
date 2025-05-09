package br.com.bertolo.carstockapi.cars.core.gateway;

import br.com.bertolo.carstockapi.cars.core.domain.Car;

public interface CarGateway {
    Long store(Car car);
}
