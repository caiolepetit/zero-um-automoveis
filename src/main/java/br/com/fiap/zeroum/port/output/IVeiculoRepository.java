package br.com.fiap.zeroum.port.output;

import br.com.fiap.zeroum.domain.entity.Veiculo;

import java.util.List;
import java.util.Optional;

public interface IVeiculoRepository {
    List<Veiculo> listarVeiculosOrdenadoPorPrecoAsc();
    Veiculo save(Veiculo veiculo);
    Optional<Veiculo> buscarVeiculoPorId(Long id);
    boolean verificarVeiculoExiste(Long id);
}