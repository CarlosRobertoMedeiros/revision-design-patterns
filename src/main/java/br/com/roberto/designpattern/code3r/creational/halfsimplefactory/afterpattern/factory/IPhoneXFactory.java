package br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory;


import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhoneX;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String nivel) {
        if(nivel.equals("standard")){
            return new IPhoneX();
        }else if(nivel.equals("highEnd")){
            return new IPhoneXSMax();
        }
        return null;
    }
}
