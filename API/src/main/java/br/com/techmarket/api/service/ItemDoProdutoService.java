package br.com.techmarket.api.service;

import br.com.techmarket.api.model.ItemDoProduto;
import br.com.techmarket.api.repository.ClienteRepository;
import br.com.techmarket.api.repository.ItemDoProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDoProdutoService {
    private final ItemDoProdutoRepository itemDoProdutoRepository;

    public ItemDoProdutoService(ItemDoProdutoRepository repo) {

        itemDoProdutoRepository = repo;
    }

    public List<ItemDoProduto> listarItemDoProdutos() {

        return itemDoProdutoRepository.findAll();
    }

    public ItemDoProduto cadastrarItemDoProduto(ItemDoProduto iProduto){
        return itemDoProdutoRepository.save(iProduto);
    }

    public ItemDoProduto buscarItemDoProdutoPorId(Integer id){
        return itemDoProdutoRepository.findById(id).orElse(null);
    }

    public ItemDoProduto deletarItemDoProdutoPorId(Integer id){
        ItemDoProduto item =  buscarItemDoProdutoPorId(id);
        if(item == null){
            return null;
        }
        itemDoProdutoRepository.delete(item);
        return item;
    }
}
