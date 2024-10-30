package br.com.fiap.zeroum.port.input;

import br.com.fiap.zeroum.domain.entity.Venda;

public interface IRealizarVenda {
    Venda realizarVenda(Long idVeiculo, String cpf);
}