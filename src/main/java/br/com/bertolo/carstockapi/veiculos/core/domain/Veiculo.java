package br.com.bertolo.carstockapi.veiculos.core.domain;

import br.com.bertolo.carstockapi.funcionarios.core.domain.Funcionario;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;

import java.time.LocalDateTime;
import java.util.Optional;

public class Veiculo {

    private Long id;
    private String chassi;
    private String renavam;
    private String placa;
    private String cor;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private CambioEnum cambio;
    private CombustivelEnum combustivel;
    private Versao versao;
    private Funcionario funcionario;
    private Optional<Venda> venda;
    private Optional<LocalDateTime> deletedAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public Veiculo() {}

    public Veiculo(Long id, String chassi, String renavam, String placa, String cor, Integer anoFabricacao, Integer anoModelo, CambioEnum cambio, CombustivelEnum combustivel, Versao versao, Funcionario funcionario, Optional<Venda> venda, Optional<LocalDateTime> deleted_at, LocalDateTime created_at, LocalDateTime updated_at) {
        this.id = id;
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.versao = versao;
        this.funcionario = funcionario;
        this.venda = venda;
        this.deletedAt = deleted_at;
        this.createdAt = created_at;
        this.updatedAt = updated_at;
    }

    public Veiculo(String chassi, String renavam, String placa, String cor, Integer anoFabricacao, Integer anoModelo, CambioEnum cambio, CombustivelEnum combustivel, Versao versao, Funcionario funcionario, Optional<Venda> venda, Optional<LocalDateTime> deleted_at, LocalDateTime created_at, LocalDateTime updated_at) {
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.versao = versao;
        this.funcionario = funcionario;
        this.venda = venda;
        this.deletedAt = deleted_at;
        this.createdAt = created_at;
        this.updatedAt = updated_at;
    }

    public Long getId() {
        return id;
    }

    public String getChassi() {
        return chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }

    public CambioEnum getCambio() {
        return cambio;
    }

    public CombustivelEnum getCombustivel() {
        return combustivel;
    }

    public Versao getVersao() {
        return versao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Optional<Venda> getVenda() {
        return venda;
    }

    public Optional<LocalDateTime> getDeletedAt() {
        return deletedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAtt() {
        return updatedAt;
    }
}
