package br.com.fiap.zeroum.adapter.response;

import br.com.fiap.zeroum.adapter.dto.VeiculoDTO;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class VendaResponse {
    private String cpf;
    private LocalDateTime data;
    private VeiculoDTO veiculo;
}