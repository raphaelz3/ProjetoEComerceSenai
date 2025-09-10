package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.ItemDoProduto;
import br.com.techmarket.api.service.ItemDoProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<ItemDoProduto> cadastrarItemDoProduto(@RequestBody ItemDoProduto itemDoProduto){
        ItemDoProduto p = itemDoProdutoService.cadastrarItemDoProduto(itemDoProduto);
        return ResponseEntity.status(HttpStatus.CREATED).body(p);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarItemDoProdutoPorId(@PathVariable Integer id){

        ItemDoProduto p = itemDoProdutoService.buscarItemDoProdutoPorId(id);

        if(p == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não Encontrado");
        }
        return ResponseEntity.ok(p);
    }
}
