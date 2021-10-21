package br.com.roberto.designpattern.javabook.creational.factorymethod;

public class ConcreteCreator extends Creator{
    @Override
    public Produto factoryMethod() {
        return new ConcreteProduto();
    }
}
