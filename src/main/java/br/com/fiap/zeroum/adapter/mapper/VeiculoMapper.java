package br.com.fiap.zeroum.adapter.mapper;

import br.com.fiap.zeroum.adapter.input.request.VeiculoRequest;
import br.com.fiap.zeroum.adapter.input.response.VeiculoResponse;
import br.com.fiap.zeroum.adapter.output.repository.entity.Veiculo;
import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class VeiculoMapper {

    public static List<VeiculoResponse> toVeiculosResponse(List<VeiculoDTO> veiculosDTO) {
        List<VeiculoResponse> veiculosResponse = new ArrayList<>();

        for(VeiculoDTO veiculoDTO : veiculosDTO) {
            veiculosResponse.add(VeiculoResponse.builder()
                    .id(veiculoDTO.getId())
                    .modelo(veiculoDTO.getModelo())
                    .ano(veiculoDTO.getAno())
                    .cor(veiculoDTO.getCor())
                    .marca(veiculoDTO.getMarca())
                    .isVendido(veiculoDTO.isVendido())
                    .dataHoraUltimaAlteracao(veiculoDTO.getDataHoraUltimaAlteracao())
                    .preco(veiculoDTO.getPreco()).build());
        }

        return veiculosResponse;
    }

    public static VeiculoResponse toVeiculoResponse(VeiculoDTO veiculoDTO) {
        return VeiculoResponse.builder()
                .id(veiculoDTO.getId())
                .marca(veiculoDTO.getMarca())
                .modelo(veiculoDTO.getModelo())
                .ano(veiculoDTO.getAno())
                .cor(veiculoDTO.getCor())
                .preco(veiculoDTO.getPreco())
                .isVendido(veiculoDTO.isVendido())
                .dataHoraUltimaAlteracao(veiculoDTO.getDataHoraUltimaAlteracao()).build();
    }

    public static VeiculoDTO toVeiculoDTO(VeiculoRequest veiculoRequest) {
        return new VeiculoDTO(null, veiculoRequest.getMarca(),
                veiculoRequest.getModelo(),
                veiculoRequest.getAno(),
                veiculoRequest.getCor(),
                veiculoRequest.getPreco(),
                veiculoRequest.isVendido(),
                veiculoRequest.getDataHoraUltimaAlteracao()
        );
    }

    public static VeiculoDTO toVeiculoDTO(VeiculoRequest veiculoRequest, Long id) {
        return new VeiculoDTO(id, veiculoRequest.getMarca(),
                veiculoRequest.getModelo(),
                veiculoRequest.getAno(),
                veiculoRequest.getCor(),
                veiculoRequest.getPreco(),
                veiculoRequest.isVendido(),
                veiculoRequest.getDataHoraUltimaAlteracao()
        );
    }

        public static Veiculo toVeiculo(VeiculoDTO veiculoDTO) {
        return Veiculo.builder()
                .id(veiculoDTO.getId() == null ? null : veiculoDTO.getId())
                .modelo(veiculoDTO.getModelo())
                .marca(veiculoDTO.getMarca())
                .ano(veiculoDTO.getAno())
                .cor(veiculoDTO.getCor())
                .preco(veiculoDTO.getPreco())
                .vendido(veiculoDTO.isVendido())
                .dataHoraUltimaAlteracao(LocalDateTime.now())
                .build();
    }

    public static VeiculoDTO toVeiculoDTO(Veiculo veiculo) {
        return new VeiculoDTO(veiculo.getId(),
                veiculo.getMarca(),
                veiculo.getModelo(),
                veiculo.getAno(),
                veiculo.getCor(),
                veiculo.getPreco(),
                veiculo.isVendido(),
                veiculo.getDataHoraUltimaAlteracao()
        );
    }

    public static List<VeiculoDTO> toVeiculosDTO(List<Veiculo> veiculos) {
        List<VeiculoDTO> veiculosDTOs = new ArrayList<>();

        for(Veiculo veiculo : veiculos) {
            veiculosDTOs.add(new VeiculoDTO(veiculo.getId(),
                    veiculo.getMarca(),
                    veiculo.getModelo(),
                    veiculo.getAno(),
                    veiculo.getCor(),
                    veiculo.getPreco(),
                    veiculo.isVendido(),
                    veiculo.getDataHoraUltimaAlteracao()));
        }

        return veiculosDTOs;
    }

}