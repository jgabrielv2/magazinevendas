package app.magazinevendas.controller;

import app.magazinevendas.dto.CategoriaDto;
import app.magazinevendas.modelo.Categoria;
import app.magazinevendas.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria create(@RequestBody CategoriaDto categoriaDto){
        return categoriaService.create(categoriaDto);
    }

    @GetMapping("nome/{nome}")
    public Categoria findByNome(@PathVariable String nome){
        return categoriaService.getByNome(nome);
    }

    @GetMapping("id/{id}")
    public Categoria findById(@PathVariable Long id){
        return categoriaService.getById(id);
    }

    @GetMapping
    public List<Categoria> findAll(){
        return categoriaService.getAll();
    }

    @PutMapping("{id}")
    public Categoria update(@PathVariable Long id, @RequestBody CategoriaDto categoriaDto){
        return categoriaService.update(id, categoriaDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        categoriaService.delete(id);
    }
}
