package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.IListarVeiculos;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVeiculos implements IListarVeiculos {

    private final IVeiculoRepository veiculoRepository;

    public ListarVeiculos(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public List<Veiculo> listarVeiculosOrdenadoPorPrecoAsc() {
        return veiculoRepository.listarVeiculosOrdenadoPorPrecoAsc();
    }
}