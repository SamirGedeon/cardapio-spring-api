package br.com.estudo.cardapioapi;

public final class PratoMapper {
    private PratoMapper() {}
    public static Prato toEntity(PratoRequest r, Long id) { return new Prato(id, r.nome().strip(), r.descricao().strip(), r.preco()); }
    public static PratoResponse toResponse(Prato item) { return new PratoResponse(item.getId(), item.getNome(), item.getDescricao(), item.getPreco()); }
}
