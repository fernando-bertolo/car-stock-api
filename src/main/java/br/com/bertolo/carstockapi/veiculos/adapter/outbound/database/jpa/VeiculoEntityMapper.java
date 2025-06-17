package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa;

import br.com.bertolo.carstockapi.funcionarios.adapter.database.jpa.entities.FuncionarioEntity;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.vendas.adapter.database.jpa.entities.VendaEntity;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;

public class VeiculoEntityMapper {
    public static VeiculoEntity toEntity(Veiculo veiculo) {
        return new VeiculoEntity(
                veiculo.getId(),
                veiculo.getChassi(),
                veiculo.getRenavam(),
                veiculo.getPlaca(),
                veiculo.getCor(),
                veiculo.getAnoFabricacao(),
                veiculo.getAnoModelo(),
                veiculo.getCambio(),
                veiculo.getCombustivel(),
                veiculo.getVersao().getId(),
                new FuncionarioEntity(),
                new VendaEntity(),
                veiculo.getDeletedAt(),
                veiculo.getCreatedAt(),
                veiculo.getUpdatedAtt()

        );
    }

//    public static Veiculo toDomain(VeiculoEntity veiculoEntity) {
//        return new Veiculo(
//                veiculoEntity.getId(),
//                veiculoEntity.getChassi(),
//                veiculoEntity.getRenavam(),
//                veiculoEntity.getPlaca(),
//                veiculoEntity.getCor(),
//                veiculoEntity.getAnoFabricacao(),
//                veiculoEntity.getAnoModelo(),
//                veiculoEntity.getCambio(),
//                veiculoEntity.getCombustivel(),
//                veiculoEntity.getVersao(),
//                veiculoEntity.getFuncionario(),
//
//        );
//    }
}
