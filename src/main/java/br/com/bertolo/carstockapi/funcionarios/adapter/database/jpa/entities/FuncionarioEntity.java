package br.com.bertolo.carstockapi.funcionarios.adapter.database.jpa.entities;

import br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.entity.VeiculoEntity;
import br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.entity.VersaoEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "funcionarios")
@Getter
@Setter
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<VeiculoEntity> veiculos = new ArrayList<>();

    public FuncionarioEntity() {}

    public FuncionarioEntity(Long id, String nome, String cargo, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
