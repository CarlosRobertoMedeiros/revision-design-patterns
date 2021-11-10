package br.com.roberto.refactoring.to.pecas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("hermanoteu")
public class PecaHermanoteuTo {

    @SerializedName("nome")
    @Expose
    private String nome;

    @SerializedName("tipo")
    @Expose
    private String tipo;

    public PecaHermanoteuTo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
