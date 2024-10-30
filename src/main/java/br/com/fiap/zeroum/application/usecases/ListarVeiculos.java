package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.port.input.IListarVeiculos;
import br.com.fiap.zeroum.application.port.output.IVeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVeiculos implements IListarVeiculos {

    private final IVeiculoRepository veiculoRepository;

    public ListarVeiculos(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public List<VeiculoDTO> listarVeiculosOrdenadoPorPrecoAsc() {
        return veiculoRepository.listarVeiculosOrdenadoPorPrecoAsc();
    }
}