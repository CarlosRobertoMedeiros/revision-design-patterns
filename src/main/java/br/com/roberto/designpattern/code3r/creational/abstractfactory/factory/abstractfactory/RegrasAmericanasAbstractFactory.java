package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado.Certificado;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado.CertificadoAmericano;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento.Empacotamento;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento.EmpacotamentoAmericano;

public class RegrasAmericanasAbstractFactory extends RegrasPorPaisAbstractFactory{

    @Override
    public Certificado getCertificados() {
        System.out.println("Certificado Americano Emitido !");
        return new CertificadoAmericano();
    }

    @Override
    public Empacotamento getEmpacotamento() {
        System.out.println("Empacotamento Americano Emitido !");
        return new EmpacotamentoAmericano();
    }
}
