package br.com.bertolo.carstockapi.cars.adapter.web;

import br.com.bertolo.carstockapi.cars.adapter.web.json.CarJson;
import br.com.bertolo.carstockapi.cars.core.controller.CarController;
import br.com.bertolo.carstockapi.cars.core.controller.CarDTOMapper;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cars")
@RequiredArgsConstructor
@Slf4j
public class CarApiController {

    private final CarController carController;

    @PostMapping
    public Long createCar(
        @Valid @RequestBody CarJson carJson
    ) {
        log.info("Creating a new car");
        return this.carController.createCar(CarDTOMapper.toDto(carJson));
    }
}

