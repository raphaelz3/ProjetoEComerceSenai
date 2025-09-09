package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Pedido;
import br.com.techmarket.api.service.PedidoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
