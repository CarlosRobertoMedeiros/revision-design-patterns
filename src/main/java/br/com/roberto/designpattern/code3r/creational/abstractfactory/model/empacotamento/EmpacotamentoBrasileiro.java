package br.com.roberto.designpattern.code3r.creational.abstractfactory.model.empacotamento;

public class EmpacotamentoBrasileiro implements Empacotamento{

    @Override
    public String empacota() {
        return "Empacotamento Brasileiro";
    }
}
