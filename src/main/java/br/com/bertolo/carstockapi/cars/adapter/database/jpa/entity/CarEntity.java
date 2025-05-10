package br.com.bertolo.carstockapi.cars.adapter.database.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Table(name = "cars")
@Getter
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private String model;
    private String color;
    private int year;
    private String plate;
    private String status;
    private double kilometers;
    private double price;

    public CarEntity() {

    }

    public CarEntity(String name, String brand, String model, String color, int year, String plate, String status, double kilometers) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.plate = plate;
        this.status = status;
        this.kilometers = kilometers;
        this.price = kilometers;
    }
}
