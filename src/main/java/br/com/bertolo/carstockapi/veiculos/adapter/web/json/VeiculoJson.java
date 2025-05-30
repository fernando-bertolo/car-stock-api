package br.com.bertolo.carstockapi.veiculos.adapter.web.json;


import br.com.bertolo.carstockapi.veiculos.core.domain.CambioEnum;
import br.com.bertolo.carstockapi.veiculos.core.domain.CombustivelEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VeiculoJson(
    String chassi,
    String renavam,
    String placa,
    String cor,
    Integer anoFabricacao,
    Integer anoModelo,
    CambioEnum cambio,
    CombustivelEnum combustivel,
    @NotBlank
    String status,
    @NotNull
    double quilometragem,
    @NotNull
    double price
){}
