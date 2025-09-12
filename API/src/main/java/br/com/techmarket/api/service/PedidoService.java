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

    public Pedido atualizarPedido(Integer id, Pedido p){
        Pedido ped =  buscarPedidoPorId(id);
        if(ped == null){
            return null;
        }
        ped.setId(p.getId());
        ped.setDataPedido(p.getDataPedido());
        ped.setIdCliente(p.getIdCliente());
        ped.setStatus(p.getStatus());
        ped.setValorTotal(p.getValorTotal());

        pedidoRepository.save(ped);
        return p;
    }
}
