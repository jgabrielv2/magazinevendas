package app.magazinevendas.service;

import app.magazinevendas.dto.CategoriaDto;
import app.magazinevendas.modelo.Categoria;

import java.util.List;

public interface CategoriaService {

    Categoria create(CategoriaDto categoriaDto);

    List<Categoria> getAll();

    Categoria getByNome(String nome);

    Categoria getById(Long id);

    Categoria update(Long id, CategoriaDto categoriaDto);

    void delete(Long id);

}
