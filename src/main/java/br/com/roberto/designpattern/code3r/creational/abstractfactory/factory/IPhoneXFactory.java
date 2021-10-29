package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.IPhone;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.IPhoneX;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

    public IPhoneXFactory(RegrasPorPaisAbstractFactory regras) {
        super(regras);
    }

    @Override
    protected IPhone createIPhone(String nivel) {
        if (nivel.equals("standard")){
            return  new IPhoneX(regras);
        }else if (nivel.equals("highEnd")){
            return new IPhoneXSMax(regras);
        }
        return null;
    }
}
