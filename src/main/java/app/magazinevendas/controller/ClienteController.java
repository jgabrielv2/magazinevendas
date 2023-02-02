package app.magazinevendas.controller;

import app.magazinevendas.dto.ClienteDto;
import app.magazinevendas.modelo.Cliente;
import app.magazinevendas.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente create(@RequestBody ClienteDto clienteDto){
        return clienteService.create(clienteDto);
    }

    @GetMapping("{cpf}")
    public Cliente buscaPorCpf(@PathVariable String cpf){
        return clienteService.getByCpf(cpf);
    }

    @GetMapping
    public List<Cliente> buscaTodos(){
        return clienteService.getAll();
    }

    @PutMapping("{id}")
    public Cliente update(@PathVariable Long id, @RequestBody ClienteDto clienteDto){
        return clienteService.update(id, clienteDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        clienteService.delete(id);
    }

    @Override
    public String toString() {
        return "ClienteController{" +
                "clienteService=" + clienteService +
                '}';
    }
}
