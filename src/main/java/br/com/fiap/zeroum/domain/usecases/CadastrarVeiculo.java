package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.ICadastrarVeiculo;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeiculo implements ICadastrarVeiculo {

    private final IVeiculoRepository veiculoRepository;

    public CadastrarVeiculo(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }
}
