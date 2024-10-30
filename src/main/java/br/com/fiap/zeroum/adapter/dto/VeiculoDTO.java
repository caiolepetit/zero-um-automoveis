package br.com.fiap.zeroum.adapter.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
public class VeiculoDTO {
    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
    private boolean isVendido;
    private LocalDateTime dataHoraUltimaAlteracao;
}