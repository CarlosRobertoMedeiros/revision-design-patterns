package br.com.roberto.designpattern.javabook.creational.factory2.factories;

import br.com.roberto.designpattern.javabook.creational.factory2.LojaDePizzas;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces.Pizza;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.chicago.ChicagoPizzaFrutosDoMar;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.chicago.ChicagoPizzaPeperoni;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.chicago.ChicagoPizzaQueijo;
import br.com.roberto.designpattern.javabook.creational.factory2.produtos.chicago.ChicagoPizzaVegana;

public class ChicagoPizzaFactory extends LojaDePizzas {


    @Override
    public Pizza createPizza(String type) {

        if (type.equals("Queijo")){
            return new ChicagoPizzaQueijo();
        }else if(type.equals("Peperoni")){
            return new ChicagoPizzaPeperoni();
        }else if(type.equals("Peperoni")){
            return new ChicagoPizzaFrutosDoMar();
        }else if(type.equals("Vegana")) {
            return new ChicagoPizzaVegana();
        }
        return null;
    }
}
