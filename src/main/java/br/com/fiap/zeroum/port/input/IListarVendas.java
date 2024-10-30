package br.com.fiap.zeroum.port.input;

import br.com.fiap.zeroum.domain.entity.Venda;

import java.util.List;

public interface IListarVendas {
    List<Venda> listarVendasOrdenadasPorPrecoVeiculoAsc();
}