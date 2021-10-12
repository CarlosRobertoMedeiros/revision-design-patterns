package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto;

public class Blusa implements Produto{

    private double preco;
    private String nome;

    public Blusa() {
        this.nome = "Blusa";
        this.preco= 50.00;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}
