package br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern;

import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory.IPhone11Factory;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory.IPhoneFactory;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory.IPhoneXFactory;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory geracaoXFactory = new IPhoneXFactory();
        IPhoneFactory geracao11Factory = new IPhone11Factory();

        System.out.println("Realizando compra de um IPhone X");
        IPhone iPhone = geracaoXFactory.efetivaPedidoCompra("standard");
        System.out.println(iPhone);

        System.out.println("Realizando compra de um IPhone 11 Highend");
        IPhone iPhone2 = geracao11Factory.efetivaPedidoCompra("highEnd");
        System.out.println(iPhone2);
    }
}
