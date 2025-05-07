package br.com.bertolo.carstockapi.users.infrastructure.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;


import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@SQLDelete(sql = "UPDATE users SET deleted_at = CURRENT_TIMESTAMP WHERE id = ?")
@Where(clause = "deleted_at IS NULL")
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

    @Column(name = "deleted_at", columnDefinition = "DATETIME")
    private LocalDateTime deleted_at;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, columnDefinition = "DATETIME")
    private LocalDateTime created_at;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "DATETIME")
    private LocalDateTime updated_at;


    protected UserEntity() {}

    public UserEntity(String nome, String email, String senha, int nivel_permissao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivel_permissao = nivel_permissao;
    }

    public void softDelete() {
        this.deleted_at = LocalDateTime.now();
    }
}
