package br.univille.projfabsoft2023.repository;

import br.univille.projfabsoft2023.controller.form.ProdutoForm;
import br.univille.projfabsoft2023.entity.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
