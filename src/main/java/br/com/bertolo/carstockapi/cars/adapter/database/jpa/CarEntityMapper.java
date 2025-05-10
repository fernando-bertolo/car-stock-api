package br.com.bertolo.carstockapi.cars.adapter.database.jpa;

import br.com.bertolo.carstockapi.cars.adapter.database.jpa.entity.CarEntity;
import br.com.bertolo.carstockapi.cars.core.domain.Car;

public class CarEntityMapper {
    public static CarEntity toEntity(Car car) {
        return new CarEntity(
                car.getName(),
                car.getBrand(),
                car.getModel(),
                car.getColor(),
                car.getYear(),
                car.getPlate(),
                car.getStatus(),
                car.getKilometers()
        );
    }

    public static Car toDomain(CarEntity carEntity) {
        return new Car(
                carEntity.getName(),
                carEntity.getBrand(),
                carEntity.getModel(),
                carEntity.getColor(),
                carEntity.getYear(),
                carEntity.getPlate(),
                carEntity.getStatus(),
                carEntity.getKilometers(),
                carEntity.getPrice()
        );
    }
}
