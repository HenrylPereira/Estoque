package br.univille.projfabsoft2023.controller;

import br.univille.projfabsoft2023.controller.form.ProdutoForm;
import br.univille.projfabsoft2023.entity.Categoria;
import br.univille.projfabsoft2023.entity.Produto;
import br.univille.projfabsoft2023.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.univille.projfabsoft2023.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    @PostMapping()
    public Produto novoProduto(@RequestBody ProdutoForm produtoForm) {

        try {
            Optional<Categoria> categoria = categoriaRepository.findById(produtoForm.getCategoriaId());
            Produto produto = new Produto(produtoForm);
            produto.setCategoria(categoria.get());
        } catch (Exception e){

        }finally {

        }

            return produtoRepository.save(produto);
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> listarTodos() {
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @GetMapping("/{id}")
    public Optional<Produto> findById(@PathVariable("id") Long id) {
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Produto updateById(@RequestBody ProdutoForm form, @PathVariable("id") Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(form.getCategoriaId());
        Produto produto = new Produto(form);
        produto.setCategoria(categoria.get());
        produto.setId(id);
        return produtoRepository.save(produto);
    }
}
