package br.com.fiap.zeroum.adapter.output.repository;

import br.com.fiap.zeroum.adapter.output.repository.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepositoryPostgres extends JpaRepository<Venda, Long> {
}