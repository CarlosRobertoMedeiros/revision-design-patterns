package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone.*;

public class IPhone11Factory extends IPhoneFactory{

    public IPhone11Factory(RegrasPorPaisAbstractFactory regras) {
        super(regras);
    }

    @Override
    protected IPhone createIPhone(String nivel) {
        if (nivel.equals("standard")){
            return  new IPhone11(regras);
        }else if (nivel.equals("highEnd")){
            return new IPhone11Pro(regras);
        }
        return null;
    }
}
