package br.com.roberto.designpattern.javabook.creational.factory;

import br.com.roberto.designpattern.javabook.creational.factory.produtos.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("Queijo")){
            pizza = new PizzaQueijo();
        }else if(type.equals("Peperoni")){
            pizza = new PizzaPeperoni();
        }else if(type.equals("Peperoni")){
            pizza = new PizzaFrutosDoMar();
        }else if(type.equals("Vegana")) {
            pizza = new PizzaVegana();
        }
        return pizza;
    }

}
