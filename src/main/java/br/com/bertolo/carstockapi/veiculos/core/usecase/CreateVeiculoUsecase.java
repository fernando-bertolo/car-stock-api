package br.com.bertolo.carstockapi.veiculos.core.usecase;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.adapter.inbound.mappers.VeiculoDTOMapper;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.ports.VeiculoGateway;

public class CreateVeiculoUsecase implements IUseCase<VeiculoDTO, Long> {

    private final VeiculoGateway veiculoGateway;

    public CreateVeiculoUsecase(VeiculoGateway veiculoGateway) {
        this.veiculoGateway = veiculoGateway;
    }


    @Override
    public Long execute(VeiculoDTO params) {
        return this.veiculoGateway.store(VeiculoDTOMapper.toDomain(params));
    }
}
