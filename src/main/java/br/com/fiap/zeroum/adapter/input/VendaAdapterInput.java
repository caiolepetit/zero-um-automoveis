package br.com.fiap.zeroum.adapter.input;

import br.com.fiap.zeroum.adapter.mapper.VendaMapper;
import br.com.fiap.zeroum.adapter.response.VendaResponse;
import br.com.fiap.zeroum.domain.entity.Venda;
import br.com.fiap.zeroum.port.input.IListarVendas;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/vendas")
@RequiredArgsConstructor
public class VendaAdapterInput {

    private final IListarVendas listarVendas;

    @GetMapping()
    public List<VendaResponse> listarVendasOrdenadasPorPrecoVeiculoAsc() {

        List<Venda> vendas = listarVendas.listarVendasOrdenadasPorPrecoVeiculoAsc();

        if(!vendas.isEmpty()) {
            return VendaMapper.toVendasResponse(vendas);
        }

        return Collections.emptyList();
    }

}