package br.com.fiap.zeroum.adapter.input;

import br.com.fiap.zeroum.adapter.dto.VeiculoDTO;
import br.com.fiap.zeroum.adapter.mapper.VeiculoMapper;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.input.ICadastrarVeiculo;
import br.com.fiap.zeroum.port.input.IEditarVeiculo;
import br.com.fiap.zeroum.port.input.IListarVeiculos;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/veiculos")
@RequiredArgsConstructor
public class VeiculoAdapterInput {

    private final IListarVeiculos listarVeiculos;
    private final ICadastrarVeiculo cadastrarVeiculo;
    private final IEditarVeiculo editarVeiculo;

    @GetMapping()
    public List<VeiculoDTO> listarTodosVeiculosOrdenadoPorPreco() {
        List<Veiculo> veiculos = listarVeiculos.listarVeiculosOrdenadoPorPrecoAsc();

        if(!veiculos.isEmpty()) {
            return VeiculoMapper.toVeiculosDTO(veiculos);
        }

        return Collections.emptyList();
    }

    @PostMapping()
    public VeiculoDTO cadastrarVeiculo(@RequestBody VeiculoDTO veiculoDTO) {
        Veiculo veiculo = cadastrarVeiculo.cadastrarVeiculo(VeiculoMapper.toVeiculo(veiculoDTO));

        return VeiculoMapper.toVeiculoDTO(veiculo);
    }

    @PutMapping("/{id}")
    public VeiculoDTO editarVeiculo(@PathVariable Long id, @RequestBody VeiculoDTO veiculoDTO) {
        Veiculo veiculo = editarVeiculo.editarVeiculo(id, VeiculoMapper.toVeiculo(veiculoDTO));

        return VeiculoMapper.toVeiculoDTO(veiculo);
    }

}