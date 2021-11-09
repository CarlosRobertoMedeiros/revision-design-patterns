package br.com.roberto.refactoring;

import java.util.List;

public class Faturamento {
    private String cliente;
    private List<Atuacao> atuacoes;

    public Faturamento(String cliente, List<Atuacao> atuacoes) {
        this.cliente = cliente;
        this.atuacoes = atuacoes;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }
}
