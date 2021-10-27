package br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.factory;

import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone;
import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory{

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
