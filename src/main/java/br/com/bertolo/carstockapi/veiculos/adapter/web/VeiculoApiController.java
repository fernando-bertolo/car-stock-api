package br.com.bertolo.carstockapi.veiculos.adapter.web;

import br.com.bertolo.carstockapi.veiculos.adapter.web.json.VeiculoJson;
import br.com.bertolo.carstockapi.veiculos.core.controller.VeiculoController;
import br.com.bertolo.carstockapi.veiculos.core.controller.VeiculoDTOMapper;
import jakarta.validation.Valid;
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
public class VeiculoApiController {

    private final VeiculoController veiculoController;

    @PostMapping
    public Long createCar(
        @Valid @RequestBody VeiculoJson carJson
    ) {
        log.info("Creating a new car");
        return this.veiculoController.createCar(VeiculoDTOMapper.toDto(carJson));
    }
}

