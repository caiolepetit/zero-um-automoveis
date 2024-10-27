package br.com.fiap.zeroum.adapter;

import br.com.fiap.zeroum.domain.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepositoryPostgres extends JpaRepository<Veiculo, Long> {
}