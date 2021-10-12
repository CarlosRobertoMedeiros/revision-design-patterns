package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.decoradores;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto.Produto;

public class ProdutoCustomizadoConcreteDecorator extends ProdutoDecorator{

    public ProdutoCustomizadoConcreteDecorator(Produto produto) {
        super(produto);
    }

    @Override
    public String getNome() {
        return super.getNome()+ " (Customizado) ";
    }

    @Override
    public double getPreco() {
        return super.getPreco()+ 10.00;
    }
}
