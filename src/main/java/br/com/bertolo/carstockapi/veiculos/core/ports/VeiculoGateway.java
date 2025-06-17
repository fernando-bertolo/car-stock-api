package br.com.bertolo.carstockapi.veiculos.core.ports;

import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

import java.util.List;

public interface VeiculoGateway {
    Long store(Veiculo veiculo);
    List<VeiculoEntity> findAll();
}
