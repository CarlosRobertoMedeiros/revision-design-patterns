package br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.decoradores;

import br.com.roberto.designpattern.javabook.structural.decorator.exemplo2.produto.Produto;

public class EstampaConcreteDecorator extends ProdutoDecorator{

    public EstampaConcreteDecorator(Produto produto) {
        super(produto);
    }

    @Override
    public String getNome() {
        return super.getNome()+ " (Estampada) ";
    }

    @Override
    public double getPreco() {
        return super.getPreco()+ 3.45;
    }
}
