package br.com.fiap.zeroum.adapter.output.repository.impl;

import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.adapter.output.repository.VendaRepositoryPostgres;
import br.com.fiap.zeroum.adapter.output.repository.entity.Venda;
import br.com.fiap.zeroum.application.dto.VendaDTO;
import br.com.fiap.zeroum.application.port.output.IVendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class VendaRepositoryImpl implements IVendaRepository {

    private final VendaRepositoryPostgres vendaRepositoryPostgres;

    @Override
    public VendaDTO save(VendaDTO vendaDTO) {
        Venda venda = vendaRepositoryPostgres.save(VendaMapper.toVenda(vendaDTO));
        return VendaMapper.toVendaDTO(venda);
    }

    @Override
    public List<VendaDTO> listarVendasOrdenadoPorPrecoVeiculoAsc() {
        List<Venda> vendas = vendaRepositoryPostgres.findAll(Sort.by(Sort.Direction.ASC, "veiculo.preco"));

        return VendaMapper.toVendasDTO(vendas);
    }
}
