package app.magazinevendas.service;

import app.magazinevendas.dto.ClienteDto;
import app.magazinevendas.modelo.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente create(ClienteDto clienteDto);

    List<Cliente> getAll();

    Cliente getByCpf(String cpf);

    Cliente getById(Long id);

    Cliente update(Long id, ClienteDto clienteDto);

    void delete(Long id);


}
