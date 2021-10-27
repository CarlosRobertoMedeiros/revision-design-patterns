package br.com.roberto.designpattern.code3r.creational.factorymethod.beforepattern;

import br.com.roberto.designpattern.code3r.creational.factorymethod.beforepattern.model.IPhone;

public class ClientSimulator {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.println(" Realizando compra de um IPhone X ");
        IPhone iPhone = client.efetivaPedidoCompra("X","standard");
        System.out.println(iPhone);

        System.out.println(" Realizando compra de um IPhone 11 HighEnd ");
        IPhone iPhone2 = client.efetivaPedidoCompra("11","highEnd");
        System.out.println(iPhone2);
    }
}
