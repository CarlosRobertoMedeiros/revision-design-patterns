package br.com.roberto.designpattern.javabook.creational.factory2.produtos.newyork;

import br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces.Pizza;

public class NewYorkPizzaQueijo extends Pizza {

    public NewYorkPizzaQueijo() {
        this.nome  = "Ny Style Pizza e molho de queijo";
        this.massa = "Fina e crosta queimada";
        this.molho = "Molho marinara";
        this.coberturas.add("Cobertura de Queijo regional");
        this.prepara();
    }
}
