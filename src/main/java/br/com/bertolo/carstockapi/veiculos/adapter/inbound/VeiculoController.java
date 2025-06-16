package br.com.bertolo.carstockapi.veiculos.adapter.inbound;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.core.usecase.CreateVeiculoUsecase;
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
public class VeiculoController {

    private final CreateVeiculoUsecase createVeiculoUsecase;

    @PostMapping
    public Long createCar(
        @Valid @RequestBody VeiculoDTO veiculoDTO
    ) {
        log.info("Creating a new car");
        return this.createVeiculoUsecase.execute(veiculoDTO);
    }
}

