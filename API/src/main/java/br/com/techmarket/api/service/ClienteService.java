package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Cliente;
import br.com.techmarket.api.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    //injeção de dependencia
    private final ClienteRepository clienteRepository; //o "final" define a variável como const

    public ClienteService(ClienteRepository repo) {
        clienteRepository = repo;
    }

    //Listar clientes
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

}
