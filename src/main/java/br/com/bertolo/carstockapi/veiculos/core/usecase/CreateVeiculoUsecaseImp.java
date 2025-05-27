package br.com.bertolo.carstockapi.veiculos.core.usecase;

import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.gateway.VeiculoGateway;

public class CreateVeiculoUsecaseImp implements CreateVeiculoUsecase {

    private final VeiculoGateway veiculoGateway;

    public CreateVeiculoUsecaseImp(VeiculoGateway veiculoGateway) {
        this.veiculoGateway = veiculoGateway;
    }

    @Override
    public Long create(Veiculo veiculo) {
        return this.veiculoGateway.store(veiculo);
    }
}
