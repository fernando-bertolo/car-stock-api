package br.com.bertolo.carstockapi.veiculos.core.gateway;

import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

public interface VeiculoGateway {
    Long store(Veiculo veiculo);
}
