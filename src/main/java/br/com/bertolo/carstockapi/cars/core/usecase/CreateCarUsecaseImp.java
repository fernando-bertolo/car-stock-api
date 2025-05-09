package br.com.bertolo.carstockapi.cars.core.usecase;

import br.com.bertolo.carstockapi.cars.core.domain.Car;
import br.com.bertolo.carstockapi.cars.core.gateway.CarGateway;

public class CreateCarUsecaseImp implements CreateCarUsecase{

    private final CarGateway carGateway;

    public CreateCarUsecaseImp(CarGateway carGateway) {
        this.carGateway = carGateway;
    }

    @Override
    public Long create(Car car) {
        return this.carGateway.store(car);
    }
}
