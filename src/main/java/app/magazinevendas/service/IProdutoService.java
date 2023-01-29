package app.magazinevendas.service;

import app.magazinevendas.dto.ProdutoDto;
import app.magazinevendas.modelo.Categoria;
import app.magazinevendas.modelo.Produto;


import java.util.List;


public interface IProdutoService {

    Produto create(ProdutoDto produtoDto);

    List<Produto> getAll();

    Produto getById(Long id);

    List<Produto> getAllByCategoria(Categoria categoria);

    Produto update(ProdutoDto produtoDto);

    Produto delete(Long id);
}
