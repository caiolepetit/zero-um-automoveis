package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.IEditarVeiculo;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EditarVeiculo implements IEditarVeiculo {

    private final IVeiculoRepository veiculoRepository;

    private final BuscarVeiculo buscarVeiculo;

    public EditarVeiculo(IVeiculoRepository veiculoRepository, BuscarVeiculo buscarVeiculo) {
        this.veiculoRepository = veiculoRepository;
        this.buscarVeiculo = buscarVeiculo;
    }

    @Override
    public Veiculo editarVeiculo(Long id, Veiculo veiculo) {
        if(!id.equals(veiculo.getId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ids do veiculo são diferentes!");
        }

        if(buscarVeiculo.verificarVeiculoExiste(id)) {
            return veiculoRepository.save(veiculo);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Veículo não cadastrado");
    }

}