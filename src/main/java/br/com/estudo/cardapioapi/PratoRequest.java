package br.com.estudo.cardapioapi;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;

// DTO de entrada; ID é gerado no servidor.
public record PratoRequest(
    @NotBlank(message="nome é obrigatório") @Size(max=120) String nome,
    @NotBlank(message="descricao é obrigatório") @Size(max=500) String descricao,
    @NotNull @DecimalMin("0.00") @Digits(integer=9, fraction=2) BigDecimal preco
) {}
