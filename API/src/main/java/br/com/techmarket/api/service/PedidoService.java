package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Pedido;
import br.com.techmarket.api.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedido) {
        pedidoRepository = pedido;
    }

    public List<Pedido> listarPedidos(){
        return pedidoRepository.findAll();
    }

    public Pedido cadastrarPedido(Pedido p){
        return pedidoRepository.save(p);
    }

    public Pedido buscarPedidoPorId(Integer id){
        return pedidoRepository.findById(id).orElse(null);
    }

    public Pedido deletarPedidoPorId(Integer id){
        Pedido p = buscarPedidoPorId(id);

        if(p == null){
            return null;
        }
        pedidoRepository.delete(p);
        return p;
    }
}
