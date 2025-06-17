package br.com.bertolo.carstockapi.veiculos.adapter.inbound;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.core.usecase.CreateVeiculoUsecase;
import br.com.bertolo.carstockapi.veiculos.core.usecase.GetAllVeiculoUsecase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/veiculos")
@RequiredArgsConstructor
@Slf4j
public class VeiculoController {

    private final CreateVeiculoUsecase createVeiculoUsecase;
    private final GetAllVeiculoUsecase getAllVeiculoUsecase;

    @PostMapping
    public Long createVeiculo(
        @Valid @RequestBody VeiculoDTO veiculoDTO
    ) {
        log.info("Creating a new car");
        return this.createVeiculoUsecase.execute(veiculoDTO);
    }

    @GetMapping
    public List<VeiculoEntity> getAllVeiculos() {
        log.info("Getting all the veiculos from the database");
        try {
            return this.getAllVeiculoUsecase.execute();
        } catch (Exception e) {
            log.error("Error while getting all the veiculos from the database", e);
            throw new RuntimeException(e);
        }
    }
}

