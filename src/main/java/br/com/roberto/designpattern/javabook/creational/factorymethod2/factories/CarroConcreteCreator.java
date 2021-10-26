package br.com.roberto.designpattern.javabook.creational.factorymethod2.factories;

import br.com.roberto.designpattern.javabook.creational.factorymethod2.Carro;
import br.com.roberto.designpattern.javabook.creational.factorymethod2.Veiculo;

public class CarroConcreteCreator extends VeiculoCreator {

    @Override
    public Veiculo getVeiculo(String nomeVeiculo) {
        return new Carro(nomeVeiculo);
    }
}
