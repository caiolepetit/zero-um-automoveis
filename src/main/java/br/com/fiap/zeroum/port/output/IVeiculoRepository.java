package br.com.fiap.zeroum.port.output;

import br.com.fiap.zeroum.domain.entity.Veiculo;

import java.util.List;

public interface IVeiculoRepository {
    List<Veiculo> listarVeiculos();
}