package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;

public class IPhoneX extends IPhone {

    public IPhoneX(RegrasPorPaisAbstractFactory regras) {
        super(regras);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
