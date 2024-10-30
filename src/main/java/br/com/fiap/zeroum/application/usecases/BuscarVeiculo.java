package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.port.input.IBuscarVeiculo;
import br.com.fiap.zeroum.application.port.output.IVeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class BuscarVeiculo implements IBuscarVeiculo {

    private final IVeiculoRepository veiculoRepository;

    public BuscarVeiculo(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public VeiculoDTO buscarVeiculoPorId(Long id) {
        return veiculoRepository.buscarVeiculoPorId(id);
    }

    @Override
    public boolean verificarVeiculoExiste(Long id) {
        return veiculoRepository.verificarVeiculoExiste(id);
    }
}