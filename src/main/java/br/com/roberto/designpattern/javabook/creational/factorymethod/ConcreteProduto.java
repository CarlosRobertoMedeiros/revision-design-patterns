package br.com.roberto.designpattern.javabook.creational.factorymethod;

public class ConcreteProduto implements Produto {

    @Override
    public void digaOla() {
        System.out.println("Olá");
    }
}
