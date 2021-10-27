package br.com.roberto.designpattern.code3r.creational.simpleFactory.afterpattern;

import br.com.roberto.designpattern.code3r.creational.simpleFactory.afterpattern.factory.IPhoneSimpleFactory;
import br.com.roberto.designpattern.code3r.creational.simpleFactory.afterpattern.model.IPhone;

public class Client {

    public static void main(String[] args) {

        System.out.println("Realizando compra de um IPhone X");
        IPhone iPhone = IPhoneSimpleFactory.efetivaPedidoCompra("X","standard");
        System.out.println(iPhone);

        System.out.println("Realizando compra de um IPhone 11");
        IPhone iPhone2 = IPhoneSimpleFactory.efetivaPedidoCompra("11","highEnd");
        System.out.println(iPhone2);

    }
}
