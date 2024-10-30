package br.com.fiap.zeroum.application.dto;

import java.time.LocalDateTime;

public class VendaDTO {

    private Long id;
    private String cpf;
    private LocalDateTime dataHoraVenda;
    private VeiculoDTO veiculoDTO;

    public VendaDTO(Long id, String cpf, LocalDateTime dataHoraVenda, VeiculoDTO veiculoDTO) {
        this.id = id;
        this.cpf = cpf;
        this.dataHoraVenda = dataHoraVenda;
        this.veiculoDTO = veiculoDTO;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public VeiculoDTO getVeiculo() {
        return veiculoDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public void setVeiculoDTO(VeiculoDTO veiculoDTO) {
        this.veiculoDTO = veiculoDTO;
    }
}