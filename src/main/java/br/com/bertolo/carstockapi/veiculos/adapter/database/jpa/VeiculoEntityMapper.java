package br.com.bertolo.carstockapi.veiculos.adapter.database.jpa;

import br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;

public class VeiculoEntityMapper {
    public static VeiculoEntity toEntity(Veiculo veiculo) {
        return new VeiculoEntity(
                veiculo.getName(),
                veiculo.getBrand(),
                veiculo.getModel(),
                veiculo.getColor(),
                veiculo.getYear(),
                veiculo.getPlate(),
                veiculo.getStatus(),
                veiculo.getKilometers()
        );
    }

    public static Veiculo toDomain(VeiculoEntity veiculoEntity) {
        return new Veiculo(
//                veiculoEntity.getId(),
//                veiculoEntity.getChassi(),
//                veiculoEntity.getRenavam(),
//                veiculoEntity.getPlaca(),
//                veiculoEntity.getCor(),
//                veiculoEntity.getAnoFabricacao(),
//                veiculoEntity.getAnoModelo(),
//                veiculoEntity.getCambio(),
//                veiculoEntity.getCombustivel(),
//                veiculoEntity.getVersaoId(),
        );
    }
}
