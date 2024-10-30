package br.com.fiap.zeroum.adapter;

import br.com.fiap.zeroum.domain.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepositoryPostgres extends JpaRepository<Venda, Long> {
}