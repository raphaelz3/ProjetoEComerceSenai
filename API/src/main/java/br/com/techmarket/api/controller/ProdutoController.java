package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Produto;
import br.com.techmarket.api.repository.ClienteRepository;
import br.com.techmarket.api.repository.ProdutoRepository;
import br.com.techmarket.api.service.ClienteService;
import br.com.techmarket.api.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
