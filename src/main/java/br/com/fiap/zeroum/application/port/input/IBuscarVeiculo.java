package br.com.fiap.zeroum.application.port.input;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;

public interface IBuscarVeiculo {
    VeiculoDTO buscarVeiculoPorId(Long id);

    boolean verificarVeiculoExiste(Long id);
}