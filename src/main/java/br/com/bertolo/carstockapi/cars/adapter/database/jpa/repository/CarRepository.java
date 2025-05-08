package br.com.bertolo.carstockapi.cars.adapter.database.jpa.repository;

import br.com.bertolo.carstockapi.cars.adapter.database.jpa.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
