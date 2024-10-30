package br.com.fiap.zeroum.adapter.input;

import br.com.fiap.zeroum.adapter.input.response.VendaResponse;
import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.application.dto.VendaDTO;
import br.com.fiap.zeroum.application.port.input.IListarVendas;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/vendas")
@RequiredArgsConstructor
public class VendaAdapterInput {

    private final IListarVendas listarVendas;

    @GetMapping()
    public List<VendaResponse> listarVendasOrdenadasPorPrecoVeiculoAsc() {

        List<VendaDTO> vendasDTO = listarVendas.listarVendasOrdenadasPorPrecoVeiculoAsc();

        return VendaMapper.toVendasResponse(vendasDTO);
    }

}