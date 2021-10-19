package br.com.roberto.designpattern.javabook.creational.factory2.produtos.chicago;

import br.com.roberto.designpattern.javabook.creational.factory2.produtos.interfaces.Pizza;

public class ChicagoPizzaQueijo extends Pizza {

    public ChicagoPizzaQueijo() {
        this.nome  = "Chicago Style Pizza Com molho de tomate e massa extra grossa";
        this.massa = "Massa Extra grossa";
        this.molho = "Molho extra de tomate";
        this.coberturas.add("Muito queijo Muzzarella");
        this.prepara();
    }

    @Override
    public void corta() {
        System.out.println("Corta a pizza em quadrados");
    }


}
