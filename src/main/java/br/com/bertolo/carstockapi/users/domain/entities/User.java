package br.com.bertolo.carstockapi.users.domain.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String nome;
    private String email;
    private String senha;
    private int nivel_permissao;

    public User(String nome, String email, String senha, int nivel_permissao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel_permissao = nivel_permissao;
    }
}
