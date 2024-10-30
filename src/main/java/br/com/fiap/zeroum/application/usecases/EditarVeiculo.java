package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.port.input.IEditarVeiculo;
import br.com.fiap.zeroum.application.port.output.IVeiculoRepository;
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
    public VeiculoDTO editarVeiculo(VeiculoDTO veiculoDTO) {
        if(buscarVeiculo.verificarVeiculoExiste(veiculoDTO.getId())) {
            return veiculoRepository.save(veiculoDTO);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Veículo não cadastrado");
    }

}