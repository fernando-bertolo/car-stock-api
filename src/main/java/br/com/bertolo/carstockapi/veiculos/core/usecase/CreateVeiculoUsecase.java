package br.com.bertolo.carstockapi.veiculos.core.usecase;

import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

public interface CreateVeiculoUsecase {
    Long create(Veiculo veiculo);
}
