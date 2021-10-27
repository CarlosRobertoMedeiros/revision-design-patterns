package br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.factory;


import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhone;
import br.com.roberto.designpattern.code3r.creational.factorymethod.afterpattern.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {


    @Override
    protected IPhone createIPhone() {
        return new IPhoneX();
    }
}
