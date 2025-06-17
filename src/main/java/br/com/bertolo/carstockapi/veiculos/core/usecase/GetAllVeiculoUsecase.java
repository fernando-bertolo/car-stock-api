package br.com.bertolo.carstockapi.veiculos.core.usecase;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.adapter.inbound.mappers.VeiculoDTOMapper;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.ports.VeiculoGateway;

import java.util.List;

public class GetAllVeiculoUsecase implements IUseCaseNoParams<List<VeiculoEntity>> {

    private final VeiculoGateway veiculoGateway;

    public GetAllVeiculoUsecase(VeiculoGateway veiculoGateway) {
        this.veiculoGateway = veiculoGateway;
    }


    @Override
    public List<VeiculoEntity> execute() {
        return this.veiculoGateway.findAll();
//        return veiculo.stream().map(VeiculoDTOMapper::toDTO).toList();
    }
}
