package br.com.fiap.zeroum.adapter.output.impl;

import br.com.fiap.zeroum.adapter.VeiculoRepositoryPostgres;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class VeiculoRepositoryImpl implements IVeiculoRepository {

    private final VeiculoRepositoryPostgres veiculoRepositoryPostgres;

    @Override
    public List<Veiculo> listarVeiculosOrdenadoPorPrecoAsc() {
        return veiculoRepositoryPostgres.findAll(Sort.by(Sort.Direction.ASC, "preco"));
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return veiculoRepositoryPostgres.save(veiculo);
    }

    @Override
    public Optional<Veiculo> buscarVeiculoPorId(Long id) {
        return veiculoRepositoryPostgres.findById(id);
    }

    @Override
    public boolean verificarVeiculoExiste(Long id) {
        return veiculoRepositoryPostgres.existsById(id);
    }
}
