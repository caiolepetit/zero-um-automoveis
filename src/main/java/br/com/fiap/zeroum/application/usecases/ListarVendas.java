package br.com.fiap.zeroum.application.usecases;

import br.com.fiap.zeroum.application.dto.VendaDTO;
import br.com.fiap.zeroum.application.port.input.IListarVendas;
import br.com.fiap.zeroum.application.port.output.IVendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVendas implements IListarVendas {

    private final IVendaRepository vendaRepository;

    public ListarVendas(IVendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    @Override
    public List<VendaDTO> listarVendasOrdenadasPorPrecoVeiculoAsc() {
        return vendaRepository.listarVendasOrdenadoPorPrecoVeiculoAsc();
    }
}