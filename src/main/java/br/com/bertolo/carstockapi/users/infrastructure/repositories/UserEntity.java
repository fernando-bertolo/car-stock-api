package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import jakarta.persistence.*;


import java.util.UUID;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 100)
    private String senha;

    @Column(nullable = false, length = 100)
    private int nivel_permissao;

    public UserEntity(UUID id, String nome, String email, String senha, int nivel_permissao) {
        this.id = id;
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

    public UUID getId() {
        return id;
    }
}
