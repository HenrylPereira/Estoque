package br.univille.projfabsoft2023.entity;
import br.univille.projfabsoft2023.controller.form.ProdutoForm;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne
    private Categoria categoria;
    private Double valor;
    private Date dataEntrada;
    private int quantidade;
    private int quantidadeMax;
    private int quantidadeMin;

    public Produto(ProdutoForm produtoForm) {
        this.titulo = produtoForm.getTitulo();
        this.valor = produtoForm.getValor();
        this.quantidade = produtoForm.getQuantidade();
        this.quantidadeMax = produtoForm.getQuantidadeMax();
        this.quantidadeMin = produtoForm.getQuantidadeMin();
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
