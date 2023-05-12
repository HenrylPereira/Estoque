package br.univille.projfabsoft2023.entity;

import javax.persistence.*;

@Entity()
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descricao;

    public Categoria(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Categoria() {

    }

    public Categoria(Categoria categoria) {
        this.titulo = categoria.titulo;
        this.descricao = categoria.descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}