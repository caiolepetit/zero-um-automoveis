package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.dto.VendaDTO;
import br.com.fiap.zeroum.application.port.input.IRealizarVenda;
import br.com.fiap.zeroum.application.port.output.IVendaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RealizarVenda implements IRealizarVenda {

    private final BuscarVeiculo buscarVeiculo;

    private final IVendaRepository vendaRepository;

    private final EditarVeiculo editarVeiculo;

    public RealizarVenda(EditarVeiculo editarVeiculo, BuscarVeiculo buscarVeiculo, IVendaRepository vendaRepository) {
        this.editarVeiculo = editarVeiculo;
        this.buscarVeiculo = buscarVeiculo;
        this.vendaRepository = vendaRepository;
    }

    @Override
    public VendaDTO realizarVenda(Long idVeiculo, String cpf) {
        VeiculoDTO veiculoDTO = buscarVeiculo.buscarVeiculoPorId(idVeiculo);

        VendaDTO vendaDTO = vendaRepository.save(VendaMapper.toVendaDTO(veiculoDTO, cpf));

        veiculoDTO.setVendido(true);
        veiculoDTO.setDataHoraUltimaAlteracao(LocalDateTime.now());

        editarVeiculo.editarVeiculo(veiculoDTO);

        vendaDTO.setVeiculoDTO(veiculoDTO);
        return vendaDTO;
    }
}