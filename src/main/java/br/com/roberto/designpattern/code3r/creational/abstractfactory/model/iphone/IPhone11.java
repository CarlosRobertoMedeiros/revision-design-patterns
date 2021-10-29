package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;

public class IPhone11 extends IPhone {

    public IPhone11(RegrasPorPaisAbstractFactory regras) {
        super(regras);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.1in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
