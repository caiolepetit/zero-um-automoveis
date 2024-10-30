package br.com.fiap.zeroum.port.output;

import br.com.fiap.zeroum.domain.entity.Venda;

import java.util.List;

public interface IVendaRepository {
    Venda save(Venda venda);
    List<Venda> listarVendasOrdenadoPorPrecoVeiculoAsc();
}