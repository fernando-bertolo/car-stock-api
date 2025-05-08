package br.com.bertolo.carstockapi.cars.core.exception;

public class NotFoundCar extends RuntimeException {
    public NotFoundCar(String message) {
        super(message);
    }
}
