package br.com.roberto.designpattern.javabook.creational.factorymethod2.factories;

import br.com.roberto.designpattern.javabook.creational.factorymethod2.Veiculo;

public abstract class VeiculoCreator {

    public abstract Veiculo getVeiculo(String nomeVeiculo);

    public Veiculo pickUp(String nomeCliente, String nomeVeiculo){
        var carro = this.getVeiculo(nomeVeiculo);
        carro.pickUp(nomeVeiculo);
        return carro;
    }
}
