package br.com.estudo.cardapioapi;

import java.math.BigDecimal;

public record PratoResponse(Long id, String nome, String descricao, BigDecimal preco) {}
