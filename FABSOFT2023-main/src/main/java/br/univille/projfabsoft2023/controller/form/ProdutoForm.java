package br.univille.projfabsoft2023.controller.form;

import java.sql.Date;

import javax.persistence.*;


public class ProdutoForm {
    private String titulo;
    private Long categoriaId;
    private Double valor;
    private Date dataEntrada;
    private int quantidade;
    private int quantidadeMax;
    private int quantidadeMin;

    public ProdutoForm(String titulo, Long categoriaId, Double valor, Date dataEntrada, int quantidade, int quantidadeMax, int quantidadeMin) {
        this.titulo = titulo;
        this.categoriaId = categoriaId;
        this.valor = valor;
        this.dataEntrada = dataEntrada;
        this.quantidade = quantidade;
        this.quantidadeMax = quantidadeMax;
        this.quantidadeMin = quantidadeMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeMax() {
        return quantidadeMax;
    }

    public void setQuantidadeMax(int quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    public int getQuantidadeMin() {
        return quantidadeMin;
    }

    public void setQuantidadeMin(int quantidadeMin) {
        this.quantidadeMin = quantidadeMin;
    }
}
