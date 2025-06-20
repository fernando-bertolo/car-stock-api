package br.com.bertolo.carstockapi.shared.interfaces;

public interface UseCase<T, R> {
    R execute(T params);
}
