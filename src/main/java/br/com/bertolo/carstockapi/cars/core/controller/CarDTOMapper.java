package br.com.bertolo.carstockapi.cars.core.controller;

import br.com.bertolo.carstockapi.cars.adapter.web.json.CarJson;
import br.com.bertolo.carstockapi.cars.core.domain.Car;
import br.com.bertolo.carstockapi.cars.core.dto.CreateCarInputDTO;

public class CarDTOMapper {
    static Car toDomain(CreateCarInputDTO car) {
        return new Car(
            car.getName(),
                car.getBrand(),
                car.getModel(),
                car.getColor(),
                car.getYear(),
                car.getPlate(),
                car.getStatus(),
                car.getKilometers(),
                car.getPrice()
        );
    }
    public static CreateCarInputDTO toDto(CarJson carJson){
        return new CreateCarInputDTO(
                carJson.name(),
                carJson.brand(),
                carJson.model(),
                carJson.color(),
                carJson.year(),
                carJson.plate(),
                carJson.status(),
                carJson.kilometers(),
                carJson.price()
        );
    }
}
