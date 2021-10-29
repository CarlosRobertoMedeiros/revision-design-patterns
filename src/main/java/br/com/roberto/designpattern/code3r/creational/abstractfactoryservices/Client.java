package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices;

import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.factory.EjbAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.factory.ServicesAbstractFactory;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.CarService;
import br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services.UserService;

public class Client {

    public static void main(String[] args) {

        ServicesAbstractFactory factory = new EjbAbstractFactory();
        //ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Carlos");
        userService.delete(8);

        CarService carService = factory.getCarService();
        carService.save("Pálio");
        carService.update("Corola");



    }
}

