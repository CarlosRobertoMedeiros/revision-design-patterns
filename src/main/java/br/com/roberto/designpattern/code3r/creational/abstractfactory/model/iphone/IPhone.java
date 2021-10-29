package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.iphone;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory.RegrasPorPaisAbstractFactory;

public abstract class IPhone {
    private RegrasPorPaisAbstractFactory regras;

    public IPhone(RegrasPorPaisAbstractFactory regras){
        this.regras = regras;
    }

    public abstract void getHardware();

    public void realizaMontagem(){
        System.out.println("Realizando montagem do Hardware!");
    }

    public void validaCertificado(){
        System.out.println("Testando todos os certificados !");
        System.out.println(regras.getCertificados().aplicarCertificado());
    }

    public void realizaEmpacotamento(){
        System.out.println("Empacota o dispositivo !");
        System.out.println(regras.getEmpacotamento().empacota());

    }

}
