package br.com.roberto.refactoring;

public class Atuacao {
    private Peca peca;
    private Long publicoPagante;

    public Atuacao(Peca peca, Long publicoPagante) {
        this.peca = peca;
        this.publicoPagante = publicoPagante;
    }

    public Peca getPeca() {
        return peca;
    }

    public Long getPublicoPagante() {
        return publicoPagante;
    }
}
