package br.com.bertolo.carstockapi.cars.core.controller;

import br.com.bertolo.carstockapi.cars.core.dto.CreateCarInputDTO;
import br.com.bertolo.carstockapi.cars.core.usecase.CreateCarUsecase;

public class CarController {
    private final CreateCarUsecase createCarUsecase;

    public CarController(CreateCarUsecase createCarUsecase) {
        this.createCarUsecase = createCarUsecase;
    }


    public Long createCar(CreateCarInputDTO car) {
        return this.createCarUsecase.create(CarDTOMapper.toDomain(car));
    }
}
