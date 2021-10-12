package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.decoradores;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto.Produto;

public class ProdutoDecorator implements Produto {
    protected Produto produto;

    public ProdutoDecorator(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String getNome() {
        return this.produto.getNome();
    }

    @Override
    public double getPreco() {
        return this.produto.getPreco();
    }
}
