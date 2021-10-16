package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto;

public class Bermuda implements Produto{

    private double preco;
    private String nome;

    public Bermuda() {
        this.nome = "Bermuda";
        this.preco= 80.00;
        
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
