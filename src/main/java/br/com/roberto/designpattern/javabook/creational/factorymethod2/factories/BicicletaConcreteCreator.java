package br.com.roberto.designpattern.javabook.creational.factorymethod2.factories;

import br.com.roberto.designpattern.javabook.creational.factorymethod2.Bicicleta;
import br.com.roberto.designpattern.javabook.creational.factorymethod2.Veiculo;

public class BicicletaConcreteCreator extends VeiculoCreator {

    @Override
    public Veiculo getVeiculo(String nomeVeiculo) {
        return new Bicicleta(nomeVeiculo);
    }
}
