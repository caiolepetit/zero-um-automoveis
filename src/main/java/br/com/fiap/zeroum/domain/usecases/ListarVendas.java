package br.com.fiap.zeroum.domain.usecases;

import br.com.fiap.zeroum.domain.entity.Venda;
import br.com.fiap.zeroum.port.input.IListarVendas;
import br.com.fiap.zeroum.port.output.IVendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVendas implements IListarVendas {

    private final IVendaRepository vendaRepository;

    public ListarVendas(IVendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    @Override
    public List<Venda> listarVendasOrdenadasPorPrecoVeiculoAsc() {
        return vendaRepository.listarVendasOrdenadoPorPrecoVeiculoAsc();
    }
}