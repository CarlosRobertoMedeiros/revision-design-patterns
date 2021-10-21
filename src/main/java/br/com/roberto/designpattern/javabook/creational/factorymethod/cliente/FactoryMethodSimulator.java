package br.com.roberto.designpattern.javabook.creational.factorymethod.cliente;

import br.com.roberto.designpattern.javabook.creational.factorymethod.ConcreteCreator;
import br.com.roberto.designpattern.javabook.creational.factorymethod.Creator;
import br.com.roberto.designpattern.javabook.creational.factorymethod.Produto;

public class FactoryMethodSimulator {

    public static void main(String[] args) {

        Creator creator = new ConcreteCreator();
        Produto produto = creator.factoryMethod();
        produto.digaOla();
        creator.createAndShow();

    }
}
