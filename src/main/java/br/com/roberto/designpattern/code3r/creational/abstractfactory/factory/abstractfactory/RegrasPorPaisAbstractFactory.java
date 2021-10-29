package br.com.roberto.designpattern.code3r.creational.abstractfactory.factory.abstractfactory;

import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.certificado.Certificado;
import br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento.Empacotamento;

public abstract class RegrasPorPaisAbstractFactory {
    public abstract Certificado getCertificados();
    public abstract Empacotamento getEmpacotamento();
}
