package br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.factory;

import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone;
import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
