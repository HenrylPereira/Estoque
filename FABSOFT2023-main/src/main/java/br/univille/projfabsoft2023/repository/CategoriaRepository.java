package br.univille.projfabsoft2023.repository;

import br.univille.projfabsoft2023.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
