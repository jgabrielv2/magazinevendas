package app.magazinevendas.service;

import app.magazinevendas.dto.ClienteDto;
import app.magazinevendas.modelo.Cliente;
import app.magazinevendas.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente create(ClienteDto clienteDto) {
        Cliente c = new Cliente();
        c.setNome(clienteDto.getNome());
        c.setCpf(clienteDto.getCpf());
        return clienteRepository.save(c);
    }

    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }

    @Override
    public Cliente getById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente update(Long id, ClienteDto clienteDto) {
        Cliente c = getById(id);
        c.setNome(clienteDto.getNome());
        c.setCpf(clienteDto.getCpf());
        return clienteRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
