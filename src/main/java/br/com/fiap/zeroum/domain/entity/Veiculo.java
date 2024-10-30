package br.com.fiap.zeroum.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Veiculo")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@SequenceGenerator(name = "veiculo_generator", sequenceName = "veiculo_id_seq", allocationSize = 1)
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "veiculo_generator")
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