package app.magazinevendas.controller;

import app.magazinevendas.dto.ProdutoDto;
import app.magazinevendas.modelo.Produto;
import app.magazinevendas.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;


    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody ProdutoDto produtoDto){
        return produtoService.create(produtoDto);
    }

    @GetMapping
    public List<Produto> findAll(){
        return produtoService.getAll();
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        produtoService.delete(id);
    }

    @PutMapping("{id}")
    public Produto update(@PathVariable Long id, @RequestBody ProdutoDto produtoDto){
        return produtoService.update(id, produtoDto);
    }




}
