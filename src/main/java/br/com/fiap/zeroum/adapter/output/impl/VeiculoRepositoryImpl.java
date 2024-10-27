package br.com.fiap.zeroum.adapter.output.impl;

import br.com.fiap.zeroum.adapter.VeiculoRepositoryPostgres;
import br.com.fiap.zeroum.domain.entity.Veiculo;
import br.com.fiap.zeroum.port.output.IVeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class VeiculoRepositoryImpl implements IVeiculoRepository {

    private final VeiculoRepositoryPostgres veiculoRepositoryPostgres;

    @Override
    public List<Veiculo> listarVeiculos() {
        return veiculoRepositoryPostgres.findAll();
    }
}
