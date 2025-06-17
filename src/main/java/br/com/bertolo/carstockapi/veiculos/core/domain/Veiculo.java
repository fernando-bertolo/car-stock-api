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
    private double quilometragem;
    private double price;

    private Long funcionarioId;
    private Long vendaId;
    private Long versaoId;

    private Funcionario funcionario;
    private Venda venda;
    private Versao versao;

    public Veiculo() {}

    public Veiculo(
            Long id,
            String chassi,
            String renavam,
            String placa,
            String cor,
            Integer anoFabricacao,
            Integer anoModelo,
            CambioEnum cambio,
            CombustivelEnum combustivel,
            double quilometragem,
            double price,
            Long funcionarioId,
            Long vendaId,
            Long versaoId
    ) {
        this.id = id;
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.price = price;
        this.funcionarioId = funcionarioId;
        this.vendaId = vendaId;
        this.versaoId = versaoId;
    }

    public Veiculo(
            String chassi,
            String renavam,
            String placa,
            String cor,
            Integer anoFabricacao,
            Integer anoModelo,
            CambioEnum cambio,
            CombustivelEnum combustivel,
            double quilometragem,
            double price,
            Versao versao,
            Funcionario funcionario,
            Venda venda
    ) {
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.price = price;
        this.versao = versao;
        this.funcionario = funcionario;
        this.venda = venda;
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

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getPrice() {
        return price;
    }

    public Versao getVersao() {
        return versao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.funcionarioId = funcionario != null ? funcionario.getId() : null;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
        this.vendaId = venda != null ? venda.getId() : null;
    }
    public void setVersao(Versao versao) {
        this.versao = versao;
        this.versaoId = versao != null ? versao.getId() : null;
    }
}
