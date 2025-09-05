package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Produto;
import br.com.techmarket.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository prod) {
        produtoRepository = prod;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

}
