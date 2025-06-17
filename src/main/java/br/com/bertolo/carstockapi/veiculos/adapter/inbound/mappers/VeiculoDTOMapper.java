package br.com.bertolo.carstockapi.veiculos.adapter.inbound.mappers;

import br.com.bertolo.carstockapi.funcionarios.core.domain.Funcionario;
import br.com.bertolo.carstockapi.veiculos.adapter.inbound.dtos.VeiculoDTO;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.domain.Versao;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;

public class VeiculoDTOMapper {

    public static Veiculo toDomain(VeiculoDTO veiculo) {
        return new Veiculo(
                veiculo.chassi(),
                veiculo.renavam(),
                veiculo.placa(),
                veiculo.cor(),
                veiculo.anoFabricacao(),
                veiculo.anoModelo(),
                veiculo.cambio(),
                veiculo.combustivel(),
                veiculo.quilometragem(),
                veiculo.price(),
                new Versao(),
                new Funcionario(),
                new Venda()
        );
    }

    public static VeiculoDTO toDTO(Veiculo veiculo) {
        return new VeiculoDTO(
                veiculo.getChassi(),
                veiculo.getRenavam(),
                veiculo.getPlaca(),
                veiculo.getCor(),
                veiculo.getAnoFabricacao(),
                veiculo.getAnoModelo(),
                veiculo.getCambio(),
                veiculo.getCombustivel(),
                "Ativo",
                veiculo.getQuilometragem(),
                veiculo.getPrice()

        );
    }
}
