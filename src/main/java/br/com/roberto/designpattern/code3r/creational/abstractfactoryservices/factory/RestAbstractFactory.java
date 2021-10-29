package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.factory;

import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarRestService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserRestService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserService;

public class RestAbstractFactory extends ServicesAbstractFactory{

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
