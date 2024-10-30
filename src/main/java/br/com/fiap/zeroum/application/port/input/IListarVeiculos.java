package br.com.fiap.zeroum.application.port.input;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;

import java.util.List;

public interface IListarVeiculos {
    List<VeiculoDTO> listarVeiculosOrdenadoPorPrecoAsc();
}