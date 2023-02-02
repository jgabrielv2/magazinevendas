package app.magazinevendas.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link app.magazinevendas.modelo.Cliente} entity
 */
public class ClienteDto implements Serializable {
    private final String nome;
    private final String cpf;

    public ClienteDto(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDto entity = (ClienteDto) o;
        return Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.cpf, entity.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "cpf = " + cpf + ")";
    }
}