package br.com.bertolo.carstockapi.veiculos.core.dto;

import br.com.bertolo.carstockapi.funcionarios.core.domain.Funcionario;
import br.com.bertolo.carstockapi.veiculos.core.domain.CambioEnum;
import br.com.bertolo.carstockapi.veiculos.core.domain.CombustivelEnum;
import br.com.bertolo.carstockapi.veiculos.core.domain.Versao;
import br.com.bertolo.carstockapi.vendas.core.domain.Venda;

public class CreateVeiculoInputDTO {
    private String chassi;
    private String renavam;
    private String placa;
    private String cor;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private CambioEnum cambio;
    private CombustivelEnum combustivel;
//    private Versao versao;
//    private Funcionario funcionario;
//    private Venda venda;


    public CreateVeiculoInputDTO(String chassi, String renavam, String placa, String cor, Integer anoFabricacao, Integer anoModelo, CambioEnum cambio, CombustivelEnum combustivel) {
        this.chassi = chassi;
        this.renavam = renavam;
        this.placa = placa;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cambio = cambio;
        this.combustivel = combustivel;
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
}
