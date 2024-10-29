package br.com.fiap.zeroum.port.input;

import br.com.fiap.zeroum.domain.entity.Veiculo;

public interface IEditarVeiculo {
    Veiculo editarVeiculo(Long id, Veiculo veiculo);
}