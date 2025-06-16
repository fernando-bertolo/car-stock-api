package br.com.bertolo.carstockapi.veiculos.adapter.inbound.mappers;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

public class VeiculoDTOMapper {

    public static Veiculo toDomain(VeiculoDTO veiculo) {
        return new Veiculo();
    }
}
