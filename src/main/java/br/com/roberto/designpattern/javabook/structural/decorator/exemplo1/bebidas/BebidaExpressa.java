package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas;

public class BebidaExpressa extends Bebida{

    public BebidaExpressa() {
        this.setDescricao("Bebida Expressa");
    }

    @Override
    public double getValor() {
        return 1.40;
    }
}
