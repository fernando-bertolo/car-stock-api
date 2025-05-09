package br.com.bertolo.carstockapi.cars.adapter.database.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity()
@Table(name = "cars")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}
