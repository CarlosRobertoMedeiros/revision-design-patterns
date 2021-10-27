package br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.factory;

import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone11;
import br.com.roberto.designpattern.code3r.creational.halfsimplefactory.afterpattern.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {


    @Override
    protected IPhone createIPhone(String nivel) {
        if(nivel.equals("standard")){
            return new IPhone11();
        }else if(nivel.equals("highEnd")){
            return new IPhone11Pro();
        }
        return null;
    }
}
