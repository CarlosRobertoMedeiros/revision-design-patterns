package br.com.roberto.designpattern.code3r.creational.factorymethod.beforepattern.model;

public abstract class IPhone {

    public abstract  void getHardware();

    public void realizaMontagem(){
        System.out.println("Realizando montagem do Hardware!");
    }

    public void validaCertificado(){
        System.out.println("Testando todos os certificados !");
    }

    public void realizaEmpacotamento(){
        System.out.println("Empacota o dispositivo !");
    }

}
