package br.com.fiap.zeroum.adapter.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class VendaDTO {
    private String cpf;
    private LocalDateTime dataVenda;
    private VeiculoDTO veiculo;
}