package br.com.fiap.zeroum.adapter.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class VeiculoDTO {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
}