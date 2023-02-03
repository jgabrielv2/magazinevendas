package app.magazinevendas.service;

import app.magazinevendas.dto.CategoriaDto;
import app.magazinevendas.modelo.Categoria;

import java.util.List;

public interface CategoriaService {

    Categoria create (CategoriaDto categoriaDto);

    Categoria getById(Long id);

    Categoria getByNome(String nome);

    List<Categoria> getAll();

    Categoria update(Long id, CategoriaDto categoriaDto);

    void delete(Long id);


}
