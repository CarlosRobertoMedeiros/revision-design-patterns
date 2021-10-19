package br.com.roberto.designpattern.javabook.creational.factory2.client;

import br.com.roberto.designpattern.javabook.creational.factory2.LojaDePizzas;
import br.com.roberto.designpattern.javabook.creational.factory2.factories.ChicagoPizzaFactory;
import br.com.roberto.designpattern.javabook.creational.factory2.factories.NYPizzaFactory;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces.Pizza;

public class TestarLojaPizzaSimulator {

    public static void main(String[] args) {

        LojaDePizzas nyLoja = new NYPizzaFactory();
        LojaDePizzas chicagoLoja = new ChicagoPizzaFactory();

        Pizza pizza = nyLoja.createPizza("Queijo");
        System.out.println("Paulo pediu " + pizza.getNome());

        Pizza pizza2 = chicagoLoja.createPizza("Queijo");
        System.out.println("Pedro pediu " + pizza2.getNome());




    }
}

//Continuar da linha 105
