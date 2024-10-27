package br.com.fiap.zeroum.adapter.mapper;

import br.com.fiap.zeroum.adapter.dto.VeiculoDTO;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class VeiculoMapper {

    public static List<VeiculoDTO> toVeiculoDTO (List<Veiculo> veiculos) {
        List<VeiculoDTO> veiculosDTOs = new ArrayList<>();

        for(Veiculo veiculo : veiculos) {
            veiculosDTOs.add(VeiculoDTO.builder()
                    .modelo(veiculo.getModelo())
                    .ano(veiculo.getAno())
                    .cor(veiculo.getCor())
                    .marca(veiculo.getMarca())
                    .preco(veiculo.getPreco()).build());
        }

        return veiculosDTOs;
    }

}