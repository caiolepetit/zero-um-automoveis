package br.com.fiap.zeroum.application.port.input;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;

public interface IEditarVeiculo {
    VeiculoDTO editarVeiculo(VeiculoDTO veiculo);
}