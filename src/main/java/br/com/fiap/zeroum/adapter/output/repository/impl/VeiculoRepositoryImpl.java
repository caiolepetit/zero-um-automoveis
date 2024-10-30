package br.com.fiap.zeroum.adapter.output.repository.impl;

import br.com.fiap.zeroum.adapter.mapper.VeiculoMapper;
import br.com.fiap.zeroum.adapter.output.repository.VeiculoRepositoryPostgres;
import br.com.fiap.zeroum.adapter.output.repository.entity.Veiculo;
import br.com.fiap.zeroum.application.dto.VeiculoDTO;
import br.com.fiap.zeroum.application.port.output.IVeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class VeiculoRepositoryImpl implements IVeiculoRepository {

    private final VeiculoRepositoryPostgres veiculoRepositoryPostgres;

    @Override
    public List<VeiculoDTO> listarVeiculosOrdenadoPorPrecoAsc() {
        List<Veiculo> veiculos = veiculoRepositoryPostgres.findAllByVendidoOrderByPrecoAsc(false);

        return VeiculoMapper.toVeiculosDTO(veiculos);
    }

    @Override
    public VeiculoDTO save(VeiculoDTO veiculoDTO) {
        Veiculo veiculo = veiculoRepositoryPostgres.save(VeiculoMapper.toVeiculo(veiculoDTO));

        return VeiculoMapper.toVeiculoDTO(veiculo);
    }

    @Override
    public VeiculoDTO buscarVeiculoPorId(Long id) {
        Optional<Veiculo> veiculo = veiculoRepositoryPostgres.findById(id);

        if(veiculo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return VeiculoMapper.toVeiculoDTO(veiculo.get());
    }

    @Override
    public boolean verificarVeiculoExiste(Long id) {
        return veiculoRepositoryPostgres.existsById(id);
    }
}
