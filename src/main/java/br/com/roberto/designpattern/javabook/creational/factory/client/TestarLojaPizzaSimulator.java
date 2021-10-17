package br.com.roberto.designpattern.javabook.creational.factory.client;

import br.com.roberto.designpattern.javabook.creational.factory.LojaPizza;
import br.com.roberto.designpattern.javabook.creational.factory.SimplePizzaFactory;
import br.com.roberto.designpattern.javabook.creational.factory.produtos.Pizza;

public class TestarLojaPizzaSimulator {

    public static void main(String[] args) {
        LojaPizza lojaPizza = new LojaPizza(new SimplePizzaFactory());
        Pizza pizza =  lojaPizza.realizaPedido("Peperoni");
        System.out.println(pizza.toString());


    }
}

//Continuar da linha 105
