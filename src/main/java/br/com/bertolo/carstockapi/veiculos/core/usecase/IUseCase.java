package br.com.bertolo.carstockapi.veiculos.core.usecase;

public interface IUseCase<P, R> {
    R execute(P params);
}
