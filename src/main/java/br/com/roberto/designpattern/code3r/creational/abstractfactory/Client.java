package br.com.roberto.designpattern.code3r.creational.abstractfactory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.IPhone11Factory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.IPhoneFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.IPhoneXFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasAmericanasAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.IPhone;

public class Client {
    public static void main(String[] args) {
        //RegrasPorPaisAbstractFactory regras = new RegrasBrasileirasAbstractFactory();
        RegrasPorPaisAbstractFactory regras = new RegrasAmericanasAbstractFactory();
        IPhoneFactory geracaoXFactory = new IPhoneXFactory(regras);
        IPhoneFactory geracao11Factory = new IPhone11Factory(regras);

        System.out.println("Gerando Ordem de Compra Iphone X");
        IPhone iPhone = geracaoXFactory.efetivaPedidoCompra("standard");
        System.out.println(iPhone);

        System.out.println("Gerando Ordem de Compra Iphone 11");
        IPhone iPhone2 = geracao11Factory.efetivaPedidoCompra("highEnd");
        System.out.println(iPhone2);


    }
}
