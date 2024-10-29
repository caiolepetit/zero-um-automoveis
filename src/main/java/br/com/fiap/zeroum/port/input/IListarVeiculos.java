package br.com.fiap.zeroum.port.input;

import br.com.fiap.zeroum.domain.entity.Veiculo;

import java.util.List;

public interface IListarVeiculos {
    List<Veiculo> listarVeiculosOrdenadoPorPrecoAsc();
}