package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Cliente;
import br.com.techmarket.api.repository.ClienteRepository;
import br.com.techmarket.api.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//indicamos qual tipo de API
@RestController
//aqui indicamos o URL da API - Endpoint
@RequestMapping("/api/clientes")
public class ClienteController {
    //Controler depende do service, então fazemos a injeção de dependência conforme abaixo
    //aqui é onde declaramos a variavel
    private final ClienteService clienteService;

    public ClienteController(ClienteService service) {//aqui criamos a dependência
        clienteService = service;
    }

    //Listar todos clientes
    @GetMapping //Essa anotação pega as informações do BD e entrega ao Front
    public ResponseEntity<List<Cliente>> listarClientes() {//ResponseEntity é quem retorna o código de resposta
        List<Cliente> clientes = clienteService.listarTodos();//Aqui pegamos a função ListarTodos de ClienteService
        return ResponseEntity.ok(clientes);
    }
}
