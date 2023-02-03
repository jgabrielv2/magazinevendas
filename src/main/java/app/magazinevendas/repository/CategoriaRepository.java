package app.magazinevendas.repository;

import app.magazinevendas.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByNomeIgnoreCase(String nome);

}