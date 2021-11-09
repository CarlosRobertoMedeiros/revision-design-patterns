package br.com.roberto.refactoring;

public class PecaProduzida {
    private String nome;
    private String tipo;

    public PecaProduzida(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
