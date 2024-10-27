package br.com.fiap.zeroum.adapter.mapper;

import br.com.fiap.zeroum.adapter.dto.VeiculoDTO;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class VeiculoMapper {

    public static List<VeiculoDTO> toVeiculosDTO(List<Veiculo> veiculos) {
        List<VeiculoDTO> veiculosDTOs = new ArrayList<>();

        for(Veiculo veiculo : veiculos) {
            veiculosDTOs.add(VeiculoDTO.builder()
                    .id(veiculo.getId())
                    .modelo(veiculo.getModelo())
                    .ano(veiculo.getAno())
                    .cor(veiculo.getCor())
                    .marca(veiculo.getMarca())
                    .preco(veiculo.getPreco()).build());
        }

        return veiculosDTOs;
    }

    public static Veiculo toVeiculo(VeiculoDTO veiculoDTO) {
        return Veiculo.builder()
                .id(veiculoDTO.getId())
                .modelo(veiculoDTO.getModelo())
                .marca(veiculoDTO.getMarca())
                .ano(veiculoDTO.getAno())
                .cor(veiculoDTO.getCor())
                .preco(veiculoDTO.getPreco())
                .build();
    }

    public static VeiculoDTO toVeiculoDTO(Veiculo veiculo) {
        return VeiculoDTO.builder()
                .id(veiculo.getId())
                .modelo(veiculo.getModelo())
                .marca(veiculo.getMarca())
                .ano(veiculo.getAno())
                .cor(veiculo.getCor())
                .preco(veiculo.getPreco())
                .build();
    }

}