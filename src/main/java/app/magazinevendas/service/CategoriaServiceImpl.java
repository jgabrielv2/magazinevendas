package app.magazinevendas.service;

import app.magazinevendas.dto.CategoriaDto;
import app.magazinevendas.modelo.Categoria;
import app.magazinevendas.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Categoria create(CategoriaDto categoriaDto) {
        Categoria c = new Categoria();
        c.setNome(categoriaDto.getNome());
        return categoriaRepository.save(c);
    }

    @Override
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria getByNome(String nome) {
        return categoriaRepository.findByNomeIgnoreCase(nome);
    }

    @Override
    public Categoria getById(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public Categoria update(Long id, CategoriaDto categoriaDto) {
        Categoria c = getById(id);
        c.setNome(categoriaDto.getNome());
        return categoriaRepository.save(c);
    }

    @Override
    public void delete(Long id) {
    categoriaRepository.deleteById(id);
    }

    @Override
    public String toString() {
        return "CategoriaServiceImpl{" +
                "categoriaRepository=" + categoriaRepository +
                '}';
    }
}
