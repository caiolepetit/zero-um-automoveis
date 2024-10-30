package br.com.fiap.zeroum.application.port.input;

import br.com.fiap.zeroum.application.dto.VendaDTO;

import java.util.List;

public interface IListarVendas {
    List<VendaDTO> listarVendasOrdenadasPorPrecoVeiculoAsc();
}