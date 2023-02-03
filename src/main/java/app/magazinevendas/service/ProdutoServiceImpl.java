package app.magazinevendas.service;

import app.magazinevendas.dto.ProdutoDto;
import app.magazinevendas.modelo.Categoria;
import app.magazinevendas.modelo.Produto;
import app.magazinevendas.repository.CategoriaRepository;
import app.magazinevendas.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    private final CategoriaRepository categoriaRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public Produto create(ProdutoDto produtoDto) {
        Produto produto = new Produto();
        Categoria c = categoriaRepository.findByNomeIgnoreCase(produtoDto.getCategoria().getNome());
        produto.setNome(produtoDto.getNome());
        produto.setPreco(produtoDto.getPreco());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setCategoria(c);
        produto.setCor(produtoDto.getCor());
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto getById(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Produto> getAllByCategoria(Categoria categoria) {
        return produtoRepository.findByCategoria(categoria);
    }

    @Override
    public Produto update(Long id, ProdutoDto produtoDto) {
        Produto produto = getById(id);
        Categoria c = categoriaRepository.findByNomeIgnoreCase(produtoDto.getCategoria().getNome());
        produto.setNome(produtoDto.getNome());
        produto.setPreco(produtoDto.getPreco());
        produto.setDescricao(produtoDto.getDescricao());
        produto.setCategoria(c);
        produto.setCor(produtoDto.getCor());
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Long id) {
        produtoRepository.delete(getById(id));
    }

    @Override
    public String toString() {
        return "ProdutoServiceImpl{" +
                "produtoRepository=" + produtoRepository +
                '}';
    }
}
