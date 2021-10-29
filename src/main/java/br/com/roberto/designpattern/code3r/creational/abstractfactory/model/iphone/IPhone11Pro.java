package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;

public class IPhone11Pro extends IPhone {

    public IPhone11Pro(RegrasPorPaisAbstractFactory regras) {
        super(regras);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
