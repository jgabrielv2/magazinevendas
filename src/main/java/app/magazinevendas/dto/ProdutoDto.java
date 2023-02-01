package app.magazinevendas.dto;

import app.magazinevendas.modelo.Categoria;
import app.magazinevendas.modelo.Produto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A DTO for the {@link Produto} entity
 */
public class ProdutoDto implements Serializable {
    private final String nome;
    private final BigDecimal preco;
    private final String cor;
    private final String descricao;
    private final Categoria categoria;

    public ProdutoDto(String nome, BigDecimal preco, String cor, String descricao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.cor = cor;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoDto entity = (ProdutoDto) o;
        return Objects.equals(this.nome, entity.nome) &&
                Objects.equals(this.preco, entity.preco) &&
                Objects.equals(this.cor, entity.cor) &&
                Objects.equals(this.descricao, entity.descricao) &&
                Objects.equals(this.categoria, entity.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, cor, descricao, categoria);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nome = " + nome + ", " +
                "preco = " + preco + ", " +
                "cor = " + cor + ", " +
                "descricao = " + descricao + ", " +
                "categoria = " + categoria + ")";
    }
}