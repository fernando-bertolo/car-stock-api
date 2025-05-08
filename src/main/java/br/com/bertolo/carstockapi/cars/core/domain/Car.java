package br.com.bertolo.carstockapi.cars.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public class Car {
    private Long id;
    private String marca;
    private String modelo;
    private String cor;
    private String ano;
    private String placa;
    private String chassi;
    private String renavam;
}
