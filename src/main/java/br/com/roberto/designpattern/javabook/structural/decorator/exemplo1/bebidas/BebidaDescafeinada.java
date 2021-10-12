package br.com.roberto.designpattern.javabook.structural.decorator.exemplo1.bebidas;

public class BebidaDescafeinada extends Bebida{

    public BebidaDescafeinada() {
        this.setDescricao("Bebida Descafeinada");
    }
    @Override
    public double getValor() {
        return 1.30;
    }
}
