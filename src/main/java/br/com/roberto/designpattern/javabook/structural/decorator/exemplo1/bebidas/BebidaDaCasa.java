package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas;

public class BebidaDaCasa extends Bebida{

    public BebidaDaCasa() {
        setDescricao("Bebida da Casa");
    }

    @Override
    public double getValor() {
        return 1.00;
    }
}
