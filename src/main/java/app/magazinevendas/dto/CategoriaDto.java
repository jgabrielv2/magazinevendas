package app.magazinevendas.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link app.magazinevendas.modelo.Categoria} entity
 */
public class CategoriaDto implements Serializable {
    private final String nome;

    public CategoriaDto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaDto entity = (CategoriaDto) o;
        return Objects.equals(this.nome, entity.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ")";
    }
}