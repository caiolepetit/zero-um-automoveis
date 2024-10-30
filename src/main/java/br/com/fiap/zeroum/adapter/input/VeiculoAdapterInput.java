package br.com.fiap.zeroum.adapter.input;

import br.com.fiap.zeroum.adapter.input.request.VeiculoRequest;
import br.com.fiap.zeroum.adapter.input.request.VendaRequest;
import br.com.fiap.zeroum.adapter.input.response.VeiculoResponse;
import br.com.fiap.zeroum.adapter.input.response.VendaResponse;
import br.com.fiap.zeroum.adapter.mapper.VeiculoMapper;
import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.dto.VendaDTO;
import br.com.fiap.zeroum.application.port.input.ICadastrarVeiculo;
import br.com.fiap.zeroum.application.port.input.IEditarVeiculo;
import br.com.fiap.zeroum.application.port.input.IListarVeiculos;
import br.com.fiap.zeroum.application.port.input.IRealizarVenda;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/veiculos")
@RequiredArgsConstructor
public class VeiculoAdapterInput {

    private final IListarVeiculos listarVeiculos;
    private final ICadastrarVeiculo cadastrarVeiculo;
    private final IEditarVeiculo editarVeiculo;
    private final IRealizarVenda realizarVenda;

    @GetMapping()
    public List<VeiculoResponse> listarTodosVeiculosOrdenadoPorPreco() {
        List<VeiculoDTO> veiculosDTO = listarVeiculos.listarVeiculosOrdenadoPorPrecoAsc();

        return VeiculoMapper.toVeiculosResponse(veiculosDTO);
    }

    @PostMapping()
    public VeiculoResponse cadastrarVeiculo(@RequestBody VeiculoRequest veiculoRequest) {
        VeiculoDTO veiculoDTO = cadastrarVeiculo.cadastrarVeiculo(VeiculoMapper.toVeiculoDTO(veiculoRequest));

        return VeiculoMapper.toVeiculoResponse(veiculoDTO);
    }

    @PutMapping("/{id}")
    public VeiculoResponse editarVeiculo(@PathVariable Long id, @RequestBody VeiculoRequest veiculoRequest) {
        VeiculoDTO veiculoDTO = editarVeiculo.editarVeiculo(VeiculoMapper.toVeiculoDTO(veiculoRequest, id));

        return VeiculoMapper.toVeiculoResponse(veiculoDTO);
    }

    @PutMapping("/{id}/venda")
    public VendaResponse realizarVenda(@PathVariable Long id, @RequestBody VendaRequest vendaRequest) {
        VendaDTO vendaDTO = realizarVenda.realizarVenda(id, vendaRequest.getCpf());

        return VendaMapper.toVendaResponse(vendaDTO);
    }

}