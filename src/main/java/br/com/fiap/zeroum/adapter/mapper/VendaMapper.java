package br.com.fiap.zeroum.adapter.mapper;

import br.com.fiap.zeroum.adapter.response.VendaResponse;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.domain.entity.Venda;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class VendaMapper {

    public static VendaResponse toVendaResponse(Venda venda) {
        return VendaResponse.builder()
                .cpf(venda.getCpf())
                .data(LocalDateTime.now())
                .veiculo(VeiculoMapper.toVeiculoDTO(venda.getVeiculo()))
                .build();
    }

    public static Venda toVenda(Veiculo veiculo, String cpf) {
        return Venda.builder()
                .dataHoraVenda(LocalDateTime.now())
                .veiculo(veiculo)
                .cpf(cpf)
                .build();
    }

    public static List<VendaResponse> toVendasResponse(List<Venda> vendas) {
        List<VendaResponse> vendasResponse = new ArrayList<>();

        for(Venda venda : vendas) {
            vendasResponse.add(VendaResponse.builder()
                            .cpf(venda.getCpf())
                            .data(venda.getDataHoraVenda())
                            .veiculo(VeiculoMapper.toVeiculoDTO(venda.getVeiculo()))
                    .build());
        }

        return vendasResponse;
    }
}