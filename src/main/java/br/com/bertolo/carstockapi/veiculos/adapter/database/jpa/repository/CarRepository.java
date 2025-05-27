package br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.repository;

import br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<VeiculoEntity, Long> {
}
