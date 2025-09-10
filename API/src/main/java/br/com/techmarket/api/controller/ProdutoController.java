package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Produto;
import br.com.techmarket.api.repository.ClienteRepository;
import br.com.techmarket.api.repository.ProdutoRepository;
import br.com.techmarket.api.service.ClienteService;
import br.com.techmarket.api.service.ProdutoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService prod) {
        produtoService = prod;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos(){
        List<Produto> produtos = produtoService.listarProdutos();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto p){
        Produto p1 = produtoService.cadastrarProduto(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(p1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProdutos(@PathVariable Integer id){
        Produto p = produtoService.buscarProdutoPorId(id);

        if (p == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
        return ResponseEntity.ok(p);
    }
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> excluirProduto(@PathVariable Integer id){
//        Produto p = ;
//    }

}
