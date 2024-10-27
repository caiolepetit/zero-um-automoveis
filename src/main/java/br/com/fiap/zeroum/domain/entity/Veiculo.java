package br.com.fiap.zeroum.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Veiculos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id
    private Long id;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private int ano;

    @Column
    private String cor;

    @Column
    private BigDecimal preco;
}