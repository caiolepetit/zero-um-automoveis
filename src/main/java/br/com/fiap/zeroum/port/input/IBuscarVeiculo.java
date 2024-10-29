package br.com.fiap.zeroum.port.input;

import br.com.fiap.zeroum.domain.entity.Veiculo;

public interface IBuscarVeiculo {
    Veiculo buscarVeiculoPorId(Long id);

    boolean verificarVeiculoExiste(Long id);
}