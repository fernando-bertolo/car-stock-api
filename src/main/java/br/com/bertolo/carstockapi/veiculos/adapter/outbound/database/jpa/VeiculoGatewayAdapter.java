package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa;

import br.com.bertolo.carstockapi.veiculos.adapter.inbound.mappers.VeiculoDTOMapper;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.repository.VeiculoRepository;
import br.com.bertolo.carstockapi.veiculos.core.domain.Veiculo;
import br.com.bertolo.carstockapi.veiculos.core.ports.VeiculoGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class VeiculoGatewayAdapter implements VeiculoGateway {

    private final VeiculoRepository veiculoRepository;

    @Override
    public Long store(Veiculo veiculo) {
        try {
            VeiculoEntity veiculoEntity = this.veiculoRepository.save(VeiculoEntityMapper.toEntity(veiculo));
            return veiculoEntity.getId();
        } catch (Exception e) {
            log.error("Error while storing car", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<VeiculoEntity> findAll() {
        try {
            return this.veiculoRepository.findAll();
//            return veiculoEntity.stream().map(VeiculoEntityMapper::toDomain).toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
