package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserService;

public abstract class ServicesAbstractFactory {
    public abstract UserService getUserService();
    public abstract CarService getCarService();
}
