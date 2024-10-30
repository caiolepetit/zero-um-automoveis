package br.com.fiap.zeroum.adapter.output.impl;

import br.com.fiap.zeroum.adapter.VendaRepositoryPostgres;
import br.com.fiap.zeroum.domain.entity.Venda;
import br.com.fiap.zeroum.port.output.IVendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class VendaRepositoryImpl implements IVendaRepository {

    private final VendaRepositoryPostgres vendaRepositoryPostgres;

    @Override
    public Venda save(Venda venda) {
        return vendaRepositoryPostgres.save(venda);
    }

    @Override
    public List<Venda> listarVendasOrdenadoPorPrecoVeiculoAsc() {
        return vendaRepositoryPostgres.findAll(Sort.by(Sort.Direction.ASC, "veiculo.preco"));
    }
}
