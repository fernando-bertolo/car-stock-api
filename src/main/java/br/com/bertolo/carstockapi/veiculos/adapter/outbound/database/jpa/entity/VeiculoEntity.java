package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity;

import br.com.bertolo.carstockapi.funcionarios.adapter.database.jpa.entities.FuncionarioEntity;
import br.com.bertolo.carstockapi.funcionarios.core.domain.Funcionario;
import br.com.bertolo.carstockapi.veiculos.core.domain.CambioEnum;
import br.com.bertolo.carstockapi.veiculos.core.domain.CombustivelEnum;
import br.com.bertolo.carstockapi.veiculos.core.domain.Versao;
import br.com.bertolo.carstockapi.vendas.adapter.database.jpa.entities.VendaEntity;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Optional;

@Entity()
@Table(name = "veiculos")
@Getter
@Setter
public class VeiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String chassi;
    private String renavam;
    private String placa;
    private String cor;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private CambioEnum cambio;
    private CombustivelEnum combustivel;

    @Column(name = "versao_id")
    private Long versaoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_id")
    private FuncionarioEntity funcionario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venda_id")
    private VendaEntity venda;

    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public VeiculoEntity() {

    }

    public VeiculoEntity(Long id, String chassi, String renavam, String placa, String cor, Integer anoFabricacao, Integer anoModelo, CambioEnum cambio, CombustivelEnum combustivel, Long versaoId, FuncionarioEntity funcionario, VendaEntity venda, LocalDateTime deletedAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.versaoId = versaoId;
        this.funcionario = funcionario;
        this.venda = venda;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public VeiculoEntity(String chassi, String renavam, String placa, String cor, Integer anoFabricacao, Integer anoModelo, CambioEnum cambio, CombustivelEnum combustivel, Long versaoId, FuncionarioEntity funcionario, VendaEntity venda, LocalDateTime deletedAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.versaoId = versaoId;
        this.funcionario = funcionario;
        this.venda = venda;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
