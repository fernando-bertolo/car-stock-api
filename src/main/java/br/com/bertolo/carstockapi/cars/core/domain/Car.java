package br.com.bertolo.carstockapi.cars.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Car {
    private String name;
    private String brand;
    private String model;
    private String color;
    private int year;
    private String plate;
    private String status;
    private double kilometers;
    private double price;
}
