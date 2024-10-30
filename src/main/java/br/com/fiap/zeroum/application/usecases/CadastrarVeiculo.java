package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.port.input.ICadastrarVeiculo;
import br.com.fiap.zeroum.application.port.output.IVeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeiculo implements ICadastrarVeiculo {

    private final IVeiculoRepository veiculoRepository;

    public CadastrarVeiculo(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public VeiculoDTO cadastrarVeiculo(VeiculoDTO veiculoDTO) {
        return veiculoRepository.save(veiculoDTO);
    }
}
