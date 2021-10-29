package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado.Certificado;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado.CertificadoBrasileiro;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento.Empacotamento;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento.EmpacotamentoBrasileiro;

public class RegrasBrasileirasAbstractFactory extends RegrasPorPaisAbstractFactory{

    @Override
    public Certificado getCertificados() {
        System.out.println("Certificado Brasileiro Emitido !");
        return new CertificadoBrasileiro();
    }

    @Override
    public Empacotamento getEmpacotamento() {
        System.out.println("Empacotamento Brasileiro Emitido !");
        return new EmpacotamentoBrasileiro();
    }
}
