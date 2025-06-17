package br.com.bertolo.carstockapi.vendas.core.domain;

public class Venda {

    private Long id;

    public Venda() {}

    public Venda(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
