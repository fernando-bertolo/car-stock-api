package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity
@Table(name = "users")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 100)
    private String senha;

    @Column(nullable = false, length = 100)
    private int nivel_permissao;


    protected UserEntity() {}

    public UserEntity(String nome, String email, String senha, int nivel_permissao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel_permissao = nivel_permissao;
    }


    public int getNivel_permissao() {
        return nivel_permissao;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }
}
