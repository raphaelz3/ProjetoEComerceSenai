package br.com.techmarket.api.service;

import br.com.techmarket.api.model.Cliente;
import br.com.techmarket.api.repository.ClienteRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
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

    public Cliente cadastrarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
