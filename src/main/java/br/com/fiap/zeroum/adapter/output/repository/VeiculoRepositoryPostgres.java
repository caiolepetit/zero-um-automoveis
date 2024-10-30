package br.com.fiap.zeroum.adapter.output.repository;

import br.com.fiap.zeroum.adapter.output.repository.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepositoryPostgres extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findAllByVendidoOrderByPrecoAsc(boolean vendido);
}