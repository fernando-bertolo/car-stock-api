package br.com.bertolo.carstockapi.veiculos.core.exception;

public class NotFoundVeiculo extends RuntimeException {
    public NotFoundVeiculo(String message) {
        super(message);
    }
}
