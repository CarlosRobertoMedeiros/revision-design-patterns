package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services;

public class CarEjbService implements CarService{

    @Override
    public void save(String nome) {
        System.out.println("Salvando "+nome + " do carro através de uma interface EJB");
    }

    @Override
    public void update(String newNome) {
        System.out.println("Atualizando o nome do carro para  "+newNome + " através de uma interface EJB");
    }
}
