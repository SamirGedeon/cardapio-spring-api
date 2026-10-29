package br.com.estudo.cardapioapi;


public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException(Long id) {
        super("Recurso " + id + " não encontrado");
    }
}
