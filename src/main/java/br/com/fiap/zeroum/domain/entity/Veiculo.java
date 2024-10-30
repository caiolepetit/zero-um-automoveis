package br.com.fiap.zeroum.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Veiculos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Column
    @Builder.Default
    private boolean vendido = false;

    @Column
    private LocalDateTime dataHoraUltimaAlteracao;
}