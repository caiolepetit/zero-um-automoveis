package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.domain.entity.Venda;
import br.com.fiap.zeroum.port.input.IRealizarVenda;
import br.com.fiap.zeroum.port.output.IVendaRepository;
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
    public Venda realizarVenda(Long idVeiculo, String cpf) {
        Veiculo veiculo = buscarVeiculo.buscarVeiculoPorId(idVeiculo);

        Venda venda = vendaRepository.save(VendaMapper.toVenda(veiculo, cpf));

        veiculo.setVendido(true);
        veiculo.setDataHoraUltimaAlteracao(LocalDateTime.now());

        editarVeiculo.editarVeiculo(veiculo.getId(), veiculo);

        return venda;
    }
}