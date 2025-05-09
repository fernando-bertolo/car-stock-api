package br.com.bertolo.carstockapi.cars.core.usecase;

import br.com.bertolo.carstockapi.cars.core.domain.Car;

public interface CreateCarUsecase {
    Long create(Car car);
}
