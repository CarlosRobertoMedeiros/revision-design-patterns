package br.com.roberto.refactoring;

public class Peca {
    private String nome;
    private Tipo tipo;

    public Peca(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
