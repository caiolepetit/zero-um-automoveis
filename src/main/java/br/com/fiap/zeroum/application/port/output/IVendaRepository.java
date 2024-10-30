package br.com.fiap.zeroum.application.port.output;

import br.com.fiap.zeroum.application.dto.VendaDTO;

import java.util.List;

public interface IVendaRepository {
    VendaDTO save(VendaDTO venda);
    List<VendaDTO> listarVendasOrdenadoPorPrecoVeiculoAsc();
}