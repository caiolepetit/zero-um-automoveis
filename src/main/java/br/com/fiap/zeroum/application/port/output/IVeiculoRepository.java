package br.com.fiap.zeroum.application.port.output;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;

import java.util.List;

public interface IVeiculoRepository {
    List<VeiculoDTO> listarVeiculosOrdenadoPorPrecoAsc();
    VeiculoDTO save(VeiculoDTO veiculoDTO);
    VeiculoDTO buscarVeiculoPorId(Long id);
    boolean verificarVeiculoExiste(Long id);
}