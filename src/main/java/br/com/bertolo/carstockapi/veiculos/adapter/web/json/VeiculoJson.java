package br.com.bertolo.carstockapi.veiculos.adapter.web.json;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VeiculoJson(
    @NotBlank
    String name,
    @NotBlank
    String brand,
    @NotBlank
    String model,
    @NotBlank
    String color,
    @NotNull
    int year,
    @NotNull
    String plate,
    @NotBlank
    String status,
    @NotNull
    double kilometers,
    @NotNull
    double price
){}
