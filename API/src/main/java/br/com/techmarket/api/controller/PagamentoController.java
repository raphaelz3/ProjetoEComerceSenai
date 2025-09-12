package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Pagamento;
import br.com.techmarket.api.repository.PagamentoRepository;
import br.com.techmarket.api.service.PagamentoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamento")
@Tag(name = "Pagamento", description = "Metodos de pagamento")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pag) {
        pagamentoService = pag;
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listarPagamento(){
        List<Pagamento> pagamento = pagamentoService.listarPagamento();
        return ResponseEntity.ok(pagamento);
    }

    @PostMapping
    public ResponseEntity<Pagamento> cadastrarPagamento(@RequestBody Pagamento pagamento){
        Pagamento pg = pagamentoService.cadastrarPagamento(pagamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(pg);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPagamentoPorId(@PathVariable Integer id){
        Pagamento pagamento = pagamentoService.buscarPagamentoPorId(id);
        if(pagamento == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id + " não encontrado");
        }
        return ResponseEntity.ok(pagamento);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarPagamentoPorId(@PathVariable Integer id){
        Pagamento pagamento = pagamentoService.deletarPagamentoPorId(id);
        if(pagamento == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id + " id não encontrado");
        }
        return ResponseEntity.ok(pagamento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>  atualizarPagamento(@PathVariable Integer id, @RequestBody Pagamento pagamento){
        Pagamento pg = pagamentoService.atualizarPagamento(id, pagamento);
        if(pagamento == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
        return ResponseEntity.ok(pg);
    }

}
