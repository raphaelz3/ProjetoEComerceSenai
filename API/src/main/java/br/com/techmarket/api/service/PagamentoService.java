package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Pagamento;
import br.com.techmarket.api.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository service) {
        pagamentoRepository = service;
    }

    public List<Pagamento> listarPagamento(){
        return pagamentoRepository.findAll();
    }
}
