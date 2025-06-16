package br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "versoes")
@Getter
@Setter
public class VersaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modelo_id")
    private ModeloEntity modelo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
