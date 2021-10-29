package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarEjbService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserEjbService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserService;

public class EjbAbstractFactory extends ServicesAbstractFactory{

    @Override
    public UserService getUserService() {
        return new UserEjbService();
    }

    @Override
    public CarService getCarService() {
        return new CarEjbService();
    }
}
