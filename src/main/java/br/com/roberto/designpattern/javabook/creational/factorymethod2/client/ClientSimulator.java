package br.com.roberto.designpattern.javabook.creational.factorymethod2.client;

import br.com.roberto.designpattern.javabook.creational.factorymethod2.factories.BicicletaConcreteCreator;
import br.com.roberto.designpattern.javabook.creational.factorymethod2.factories.CarroConcreteCreator;

public class ClientSimulator {

    public static void main(String[] args) {

        var carroConcreteCreator = new CarroConcreteCreator();

        var fusca = carroConcreteCreator.getVeiculo("Fusca");
        fusca.pickUp("Joana");
        fusca.parar();

        var celta = carroConcreteCreator.getVeiculo("Celta");
        celta.pickUp("Lucia");
        celta.parar();

        var bicicletaConcreteCreator = new BicicletaConcreteCreator();

        var bicicleta = bicicletaConcreteCreator.getVeiculo("Bicicleta");
        bicicleta.pickUp("Armando");
        bicicleta.parar();
    }
}
//https://www.youtube.com/watch?v=KouxYcDA2HA
//Continuar do minuto 8:15