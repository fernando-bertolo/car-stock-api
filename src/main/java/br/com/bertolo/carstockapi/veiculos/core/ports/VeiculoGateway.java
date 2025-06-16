package br.com.bertolo.carstockapi.veiculos.core.ports;

import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

public interface VeiculoGateway {
    Long store(Veiculo veiculo);
}
