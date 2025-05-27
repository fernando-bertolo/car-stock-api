package br.com.bertolo.carstockapi.veiculos.core.dto;

public class CreateVeiculoInputDTO {
    private String name;
    private String brand;
    private String model;
    private String color;
    private int year;
    private String plate;
    private String status;
    private double kilometers;
    private double price;

    public CreateVeiculoInputDTO(String name, String brand, String model, String color, int year, String plate, String status, double kilometers, double price) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.plate = plate;
        this.status = status;
        this.kilometers = kilometers;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getPlate() {
        return plate;
    }

    public String getStatus() {
        return status;
    }

    public double getKilometers() {
        return kilometers;
    }

    public double getPrice() {
        return price;
    }
}
