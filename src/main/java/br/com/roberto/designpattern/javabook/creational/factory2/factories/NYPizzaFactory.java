package br.com.roberto.designpattern.javabook.creational.factory2.factories;

import br.com.roberto.designpattern.javabook.creational.factory2.LojaDePizzas;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces.Pizza;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.newyork.NewYorkPizzaFrutosDoMar;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.newyork.NewYorkPizzaPeperoni;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.newyork.NewYorkPizzaQueijo;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.newyork.NewYorkPizzaVegana;

public class NYPizzaFactory extends LojaDePizzas {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Queijo")){
            return new NewYorkPizzaQueijo();
        }else if(type.equals("Peperoni")){
            return new NewYorkPizzaPeperoni();
        }else if(type.equals("Peperoni")){
            return new NewYorkPizzaFrutosDoMar();
        }else if(type.equals("Vegana")) {
            return new NewYorkPizzaVegana();
        }
        return null;
    }
}
