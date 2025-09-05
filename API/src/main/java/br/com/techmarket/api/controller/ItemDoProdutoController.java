package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.ItemDoProduto;
import br.com.techmarket.api.service.ItemDoProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ItemdoProduto")
public class ItemDoProdutoController {
    private final ItemDoProdutoService itemDoProdutoService;

    public ItemDoProdutoController(ItemDoProdutoService item) {
        itemDoProdutoService = item;
    }
    @GetMapping
    public ResponseEntity<List<ItemDoProduto>> listarItemDoProdutos() {
        List<ItemDoProduto> itemDoProdutos = itemDoProdutoService.listarItemDoProdutos();
        return ResponseEntity.ok(itemDoProdutos);
    }
}
