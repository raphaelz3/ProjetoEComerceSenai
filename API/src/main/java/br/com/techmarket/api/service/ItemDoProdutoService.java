package br.com.techmarket.api.service;

import br.com.techmarket.api.model.ItemDoProduto;
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
}
