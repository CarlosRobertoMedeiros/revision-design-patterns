package br.com.roberto.refactoring.to.faturas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListaAtuacoesTo {

    @SerializedName("cliente")
    @Expose
    private String cliente;

    @SerializedName("atuacoes")
    @Expose
    private List<AtuacaoTo> atuacoes = null;

    public ListaAtuacoesTo(String cliente, List<AtuacaoTo> atuacoes) {
        this.cliente = cliente;
        this.atuacoes = atuacoes;
    }

    public String getCliente() {
        return cliente;
    }

   public List<AtuacaoTo> getAtuacoes() {
        return atuacoes;
    }
}
