package br.com.fiap.zeroum.adapter.input;

import br.com.fiap.zeroum.adapter.dto.VeiculoDTO;
import br.com.fiap.zeroum.adapter.mapper.VeiculoMapper;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.IListarVeiculos;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/veiculos")
@RequiredArgsConstructor
public class VeiculoAdapterInput {

    private final IListarVeiculos listarVeiculos;

    @GetMapping()
    public List<VeiculoDTO> listarTodosVeiculosOrdenadoPorPreco() {
        List<Veiculo> veiculos = listarVeiculos.listarVeiculos();

        if(!veiculos.isEmpty()) {
            return VeiculoMapper.toVeiculoDTO(veiculos);
        }

        return Collections.emptyList();
    }

}