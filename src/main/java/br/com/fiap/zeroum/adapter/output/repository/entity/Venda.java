package br.com.fiap.zeroum.adapter.output.repository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Venda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "venda_generator", sequenceName = "venda_id_seq", allocationSize = 1)
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "venda_generator")
    private Long id;

    @Column
    private String cpf;

    @Column
    private LocalDateTime dataHoraVenda;

    @OneToOne
    @JoinColumn(name = "veiculo_id", referencedColumnName = "id")
    private Veiculo veiculo;
}