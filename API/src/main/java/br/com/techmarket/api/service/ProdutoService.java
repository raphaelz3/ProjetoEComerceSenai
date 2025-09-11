package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Cliente;
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

    public Produto cadastrarProduto(Produto p){
        return produtoRepository.save(p);
    }

    public Produto buscarProdutoPorId(Integer id){
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto deletarProdutoPorId(Integer id){
        Produto c =  buscarProdutoPorId(id);
        if(c == null){
            return null;
        }
        produtoRepository.delete(c);
        return c;
    }
}
