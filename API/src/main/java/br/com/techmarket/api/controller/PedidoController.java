package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Pedido;
import br.com.techmarket.api.service.PedidoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedid) {
        pedidoService = pedid;
    }

    @GetMapping
   public ResponseEntity<List<Pedido>> listarPedidos(){
        List<Pedido> pedidos =  pedidoService.listarPedidos();
        return ResponseEntity.ok().body(pedidos);
    }

    @PostMapping
    public ResponseEntity<Pedido> cadastrarPedido(@RequestBody Pedido p){
        Pedido p1 = pedidoService.cadastrarPedido(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(p1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPedidoPorId(@PathVariable Integer id){
        Pedido p = pedidoService.buscarPedidoPorId(id);
        if(p == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
        return ResponseEntity.ok(p);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPedidoPorId(@PathVariable Integer id){
        Pedido p = pedidoService.deletarPedidoPorId(id);
        if(p == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id + "Não encontrado");
        }
        return ResponseEntity.ok(p);
    }
}
