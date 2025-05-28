package br.com.bertolo.carstockapi.veiculos.core.controller;

import br.com.bertolo.carstockapi.funcionarios.core.domain.Funcionario;
import br.com.bertolo.carstockapi.veiculos.adapter.web.json.VeiculoJson;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.domain.Versao;
import br.com.bertolo.carstockapi.veiculos.core.dto.CreateVeiculoInputDTO;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;

public class VeiculoDTOMapper {
    public static CreateVeiculoInputDTO toDto(VeiculoJson veiculoJson){
        return new CreateVeiculoInputDTO(
                veiculoJson.chassi(),
                veiculoJson.renavam(),
                veiculoJson.placa(),
                veiculoJson.cor(),
                veiculoJson.anoFabricacao(),
                veiculoJson.anoModelo(),
                veiculoJson.cambio(),
                veiculoJson.combustivel()
        );
    }
    static Veiculo toDomain(CreateVeiculoInputDTO veiculo) {
        return new Veiculo(
                veiculo.getChassi(),
                veiculo.getRenavam(),
                veiculo.getPlaca(),
                veiculo.getCor(),
                veiculo.getAnoFabricacao(),
                veiculo.getAnoModelo(),
                veiculo.getCambio(),
                veiculo.getCombustivel(),
                new Versao(),
                new Funcionario(),
                new Venda(),
                null,
                null,
                null
        );
    }
}
