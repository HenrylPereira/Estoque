package br.univille.projfabsoft2023.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import br.univille.projfabsoft2023.entity.Categoria;
import br.univille.projfabsoft2023.entity.Produto;
import br.univille.projfabsoft2023.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping()
    public ResponseEntity<List<Categoria>> listarTodos() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    @PostMapping()
    public Categoria novCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable("id") Long id) {
        return categoriaRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        categoriaRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Categoria updateById(@RequestBody Categoria form, @PathVariable("id") Long id) {
        Categoria categoria = new Categoria(form);
        categoria.setId(id);
        return categoriaRepository.save(categoria);
    }
}
