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
}
