package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Pagamento;
import br.com.techmarket.api.repository.PagamentoRepository;
import br.com.techmarket.api.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pagamento")
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

}
