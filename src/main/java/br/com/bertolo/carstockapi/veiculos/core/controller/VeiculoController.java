package br.com.bertolo.carstockapi.veiculos.core.controller;

import br.com.bertolo.carstockapi.veiculos.core.dto.CreateVeiculoInputDTO;
import br.com.bertolo.carstockapi.veiculos.core.usecase.CreateVeiculoUsecase;

public class VeiculoController {
    private final CreateVeiculoUsecase createVeiculoUsecase;

    public VeiculoController(CreateVeiculoUsecase createVeiculoUsecase) {
        this.createVeiculoUsecase = createVeiculoUsecase;
    }

    public Long createCar(CreateVeiculoInputDTO car) {
        return this.createVeiculoUsecase.create(VeiculoDTOMapper.toDomain(car));
    }
}
