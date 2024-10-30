package br.com.fiap.zeroum.application.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VeiculoDTO {

    private Long id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private BigDecimal preco;
    private boolean vendido;
    private LocalDateTime dataHoraUltimaAlteracao;

    public VeiculoDTO(Long id, String marca, String modelo, int ano, String cor, BigDecimal preco, boolean vendido, LocalDateTime dataHoraUltimaAlteracao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.vendido = vendido;
        this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
    }

    public Long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public boolean isVendido() {
        return vendido;
    }

    public LocalDateTime getDataHoraUltimaAlteracao() {
        return dataHoraUltimaAlteracao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public void setDataHoraUltimaAlteracao(LocalDateTime dataHoraUltimaAlteracao) {
        this.dataHoraUltimaAlteracao = dataHoraUltimaAlteracao;
    }
}