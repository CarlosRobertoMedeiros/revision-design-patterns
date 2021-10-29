package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services;

public class CarRestService implements CarService{

    @Override
    public void save(String nome) {
        System.out.println("Salvando "+nome + " do carro através de uma interface Rest");
    }

    @Override
    public void update(String newNome) {
        System.out.println("Atualizando o nome do carro para  "+newNome + " através de uma interface Rest");
    }
}
