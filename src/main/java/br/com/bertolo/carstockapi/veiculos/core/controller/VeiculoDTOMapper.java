package br.com.bertolo.carstockapi.veiculos.core.controller;

import br.com.bertolo.carstockapi.veiculos.adapter.web.json.VeiculoJson;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.dto.CreateVeiculoInputDTO;

public class VeiculoDTOMapper {
    static Veiculo toDomain(CreateVeiculoInputDTO veiculo) {
        return new Veiculo(
                veiculo.
        );
    }
    public static CreateVeiculoInputDTO toDto(VeiculoJson carJson){
        return new CreateVeiculoInputDTO(
                carJson.name(),
                carJson.brand(),
                carJson.model(),
                carJson.color(),
                carJson.year(),
                carJson.plate(),
                carJson.status(),
                carJson.kilometers(),
                carJson.price()
        );
    }
}
