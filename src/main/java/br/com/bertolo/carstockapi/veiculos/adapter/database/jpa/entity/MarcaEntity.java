package br.com.bertolo.carstockapi.veiculos.adapter.database.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "marcas")
@Getter
@Setter
public class MarcaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @OneToMany(mappedBy = "marca", fetch = FetchType.LAZY)
    private List<ModeloEntity> modelos = new ArrayList<>();
}
