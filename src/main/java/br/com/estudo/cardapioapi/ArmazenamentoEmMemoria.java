package br.com.estudo.cardapioapi;

import java.util.*;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public abstract class ArmazenamentoEmMemoria implements PratoModel {
    private final Map<Long, Prato> itens = new LinkedHashMap<>();
    private final AtomicLong sequencia = new AtomicLong();
    public synchronized Prato criar(Prato entrada) {
        Long id = sequencia.incrementAndGet();
        Prato criado = new Prato(id, entrada.getNome(), entrada.getDescricao(), entrada.getPreco());
        itens.put(id, criado);
        return criado;
    }
    public synchronized List<Prato> listar(String nome) {
        
        return itens.values().stream()
                        .filter(item -> nome == null || nome.isBlank() || item.getNome().toLowerCase(Locale.ROOT).contains(nome.strip().toLowerCase(Locale.ROOT)))
            .toList();
    }
    public synchronized Optional<Prato> buscar(Long id) { return Optional.ofNullable(itens.get(id)); }
    public synchronized Optional<Prato> atualizar(Long id, Prato entrada) {
        if (!itens.containsKey(id)) return Optional.empty();
        Prato atualizado = new Prato(id, entrada.getNome(), entrada.getDescricao(), entrada.getPreco());
        itens.put(id, atualizado);
        return Optional.of(atualizado);
    }
    public synchronized boolean excluir(Long id) { return itens.remove(id) != null; }
}
