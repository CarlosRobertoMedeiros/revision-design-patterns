package br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern;


import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.factory.*;
import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone;

public class Client {

    public static void main(String[] args) {
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhoneXMax = new IPhoneXSMaxFactory();
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iPhone11ProFactory = new IPhone11ProFactory();

        System.out.println("Realizando compra de um IPhone X");
        IPhone iPhone = iPhoneXFactory.efetivaPedidoCompra();
        System.out.println(iPhone);

        System.out.println("Realizando compra de um IPhone X Max");
        IPhone iPhone2 = iPhoneXMax.efetivaPedidoCompra();
        System.out.println(iPhone2);

        System.out.println("Realizando compra de um IPhone 11");
        IPhone iPhone3 = iPhone11Factory.efetivaPedidoCompra();
        System.out.println(iPhone3);

        System.out.println("Realizando compra de um IPhone 11 HighEnd");
        IPhone iPhone4 = iPhone11ProFactory.efetivaPedidoCompra();
        System.out.println(iPhone4);
    }
}
