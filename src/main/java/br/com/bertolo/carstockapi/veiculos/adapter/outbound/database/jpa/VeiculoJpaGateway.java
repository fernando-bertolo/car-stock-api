package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa;

import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.repository.CarRepository;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.ports.VeiculoGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class VeiculoJpaGateway implements VeiculoGateway {

    private final CarRepository carRepository;

    @Override
    public Long store(Veiculo veiculo) {
        try {
            VeiculoEntity veiculoEntity = this.carRepository.save(VeiculoEntityMapper.toEntity(veiculo));
            return veiculoEntity.getId();
        } catch (Exception e) {
            log.error("Error while storing car", e);
            throw new RuntimeException(e);
        }
    }
}
