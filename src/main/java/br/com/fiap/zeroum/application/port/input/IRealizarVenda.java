package br.com.fiap.zeroum.application.port.input;

import br.com.fiap.zeroum.application.dto.VendaDTO;

public interface IRealizarVenda {
    VendaDTO realizarVenda(Long idVeiculo, String cpf);
}