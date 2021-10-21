package br.com.roberto.designpattern.javabook.creational.factorymethod2.client;

import br.com.roberto.designpattern.javabook.creational.factorymethod2.Carro;

public class ClientSimulator {
    public static void main(String[] args) {
        Carro fusca = new Carro("Fusca");
        fusca.pickUp("Joana");
        fusca.parar();
    }
}
//https://www.youtube.com/watch?v=KouxYcDA2HA
//Continuar do minuto 8:15