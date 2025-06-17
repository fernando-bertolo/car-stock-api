package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.repository;

import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository extends JpaRepository<VeiculoEntity, Long> {
    @Query("SELECT v FROM VeiculoEntity v " +
            "LEFT JOIN FETCH v.funcionario " +
            "LEFT JOIN FETCH v.venda " +
            "LEFT JOIN FETCH v.versao " +
            "WHERE v.id = :id")
    Optional<VeiculoEntity> findByIdWithRelationships(@Param("id") Long id);

    @Query("SELECT v FROM VeiculoEntity v " +
            "LEFT JOIN FETCH v.funcionario " +
            "LEFT JOIN FETCH v.venda " +
            "LEFT JOIN FETCH v.versao")
    List<VeiculoEntity> findAllWithRelationships();
}
