package br.com.fiap.zeroum.adapter.input.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class VendaResponse {
    private String cpf;
    private LocalDateTime data;
    private VeiculoResponse veiculo;
}