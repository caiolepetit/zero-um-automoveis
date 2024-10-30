package br.com.fiap.zeroum.adapter.mapper;

import br.com.fiap.zeroum.adapter.input.response.VendaResponse;
import br.com.fiap.zeroum.adapter.output.repository.entity.Venda;
import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.dto.VendaDTO;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class VendaMapper {

    public static VendaResponse toVendaResponse(VendaDTO vendaDTO) {
        return VendaResponse.builder()
                .cpf(vendaDTO.getCpf())
                .data(vendaDTO.getDataHoraVenda())
                .veiculo(VeiculoMapper.toVeiculoResponse(vendaDTO.getVeiculo()))
                .build();
    }

    public static Venda toVenda(VeiculoDTO veiculoDTO, String cpf) {
        return Venda.builder()
                .dataHoraVenda(LocalDateTime.now())
                .veiculo(VeiculoMapper.toVeiculo(veiculoDTO))
                .cpf(cpf)
                .build();
    }

    public static VendaDTO toVendaDTO(VeiculoDTO veiculoDTO, String cpf) {
        return new VendaDTO(null, cpf, LocalDateTime.now(), veiculoDTO);
    }

    public static List<VendaResponse> toVendasResponse(List<VendaDTO> vendasDTO) {
        List<VendaResponse> vendasResponse = new ArrayList<>();

        for(VendaDTO vendaDTO : vendasDTO) {
            vendasResponse.add(VendaResponse.builder()
                            .cpf(vendaDTO.getCpf())
                            .data(vendaDTO.getDataHoraVenda())
                            .veiculo(VeiculoMapper.toVeiculoResponse(vendaDTO.getVeiculo()))
                    .build());
        }

        return vendasResponse;
    }

    public static Venda toVenda(VendaDTO vendaDTO) {
        return Venda.builder()
                .cpf(vendaDTO.getCpf())
                .dataHoraVenda(LocalDateTime.now())
                .veiculo(VeiculoMapper.toVeiculo(vendaDTO.getVeiculo())).build();
    }

    public static VendaDTO toVendaDTO(Venda venda) {
        return new VendaDTO(venda.getId(),
                venda.getCpf(),
                venda.getDataHoraVenda(),
                VeiculoMapper.toVeiculoDTO(venda.getVeiculo()));
    }

    public static List<VendaDTO> toVendasDTO(List<Venda> vendas) {
        List<VendaDTO> vendasDTO = new ArrayList<>();

        for(Venda venda : vendas) {
            vendasDTO.add(new VendaDTO(venda.getId(),
                    venda.getCpf(),
                    venda.getDataHoraVenda(),
                    VeiculoMapper.toVeiculoDTO(venda.getVeiculo())));
        }

        return vendasDTO;
    }
}