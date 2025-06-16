package br.com.bertolo.carstockapi.vendas.adapter.database.jpa.entities;

import br.com.bertolo.carstockapi.veiculos.adapter.outbound.database.jpa.entity.VeiculoEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vendas")
@Getter
@Setter
public class VendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_venda")
    private LocalDateTime dataVenda;
    private Double valor;
    private String funcionario;
    private LocalDateTime deletedAt;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "venda", fetch = FetchType.LAZY)
    private List<VeiculoEntity> veiculos = new ArrayList<>();
}
