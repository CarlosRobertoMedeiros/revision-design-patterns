package br.com.roberto.designpattern.javabook.creational.factory;

import br.com.roberto.designpattern.javabook.creational.factory.produtos.Pizza;

public class LojaPizza {

    private SimplePizzaFactory factory;

    public LojaPizza(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza realizaPedido(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepara();
        pizza.cozinha();
        pizza.corta();
        pizza.encaixota();
        return pizza;
    }
}
