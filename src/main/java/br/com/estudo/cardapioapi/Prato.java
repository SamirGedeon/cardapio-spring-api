package br.com.estudo.cardapioapi;

import java.math.BigDecimal;

public class Prato {
    private final Long id;
    private final String nome;
    private final String descricao;
    private final BigDecimal preco;
    public Prato(Long id, String nome, String descricao, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public BigDecimal getPreco() { return preco; }
}
