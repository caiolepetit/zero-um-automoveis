package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.IBuscarVeiculo;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class BuscarVeiculo implements IBuscarVeiculo {

    private final IVeiculoRepository veiculoRepository;

    public BuscarVeiculo(IVeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public Veiculo buscarVeiculoPorId(Long id) {
        Optional<Veiculo> veiculo = veiculoRepository.buscarVeiculoPorId(id);

        if(veiculo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return veiculo.get();
    }

    @Override
    public boolean verificarVeiculoExiste(Long id) {
        return veiculoRepository.verificarVeiculoExiste(id);
    }
}