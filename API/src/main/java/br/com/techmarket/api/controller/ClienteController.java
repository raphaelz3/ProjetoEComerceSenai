package br.com.techmarket.api.controller;

import br.com.techmarket.api.model.Cliente;
import br.com.techmarket.api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente){//RequestBody é usado para receber informações do corpo
         Cliente c = clienteService.cadastrarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(c);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarClientePorId(@PathVariable Integer id){//PathVariable é usado para receber dados pelo URL
        //Procuramos o cliente
        Cliente c = clienteService.buscarClientePorId(id);
        //o que fazer se não encontrar
        if (c == null){
            //return ResponseEntity.notFound().build(); retorna o erro de maneira simples ou
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("404\n" + "Cliente " + id + " não encontrado");//essa forma é mais completa ;)
        }
        //se encontrar retorna o cliente
            return ResponseEntity.ok(c);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarClientePorId(@PathVariable Integer id){
        Cliente c = clienteService.deletarClientePorId(id);
        if (c == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
        return ResponseEntity.ok(c);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarCliente(@PathVariable Integer id, @RequestBody Cliente clienteNovo){
        Cliente clienteAntigo = clienteService.atualizarCliente(id, clienteNovo);
        if (clienteAntigo == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado");
        }
        return ResponseEntity.ok(clienteAntigo);
    }
}
