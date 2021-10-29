package br.com.roberto.designpattern.code3r.creational.abstractfactoryservices.services;

public class UserRestService implements UserService{

    @Override
    public void save(String nome) {
        System.out.println("Salvando "+nome + " através de uma interface Rest");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("removendo o usuário de Id "+id + " através de uma interface Rest");
        return true;
    }
}
