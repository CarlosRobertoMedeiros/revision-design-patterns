package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas;

public class BebidaTorrada extends Bebida{

    public BebidaTorrada() {
        this.setDescricao("Bebida Torrada");
    }

    @Override
    public double getValor() {
        return 1.50;
    }
}
