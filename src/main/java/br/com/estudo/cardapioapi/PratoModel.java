package br.com.estudo.cardapioapi;

import java.util.*;
import java.math.BigDecimal;
public interface PratoModel {
    Prato criar(Prato entrada);
    List<Prato> listar(String nome);
    Optional<Prato> buscar(Long id);
    Optional<Prato> atualizar(Long id, Prato entrada);
    boolean excluir(Long id);
}
