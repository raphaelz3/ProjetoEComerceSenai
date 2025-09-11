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

    public Pagamento cadastrarPagamento(Pagamento p){

        return pagamentoRepository.save(p);
    }

    public Pagamento buscarPagamentoPorId(Integer id) {
        return pagamentoRepository.findById(id).orElse(null);
    }

    public Pagamento deletarPagamentoPorId(Integer id) {
        Pagamento p = buscarPagamentoPorId(id);
        if(p == null){
            return null;
        }
        pagamentoRepository.deleteById(id);
        return p;
    }
}
