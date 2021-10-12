package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel.ArmadoComFaca;

public class Rainha extends Jogador{

    public Rainha() {
        armavel =  new ArmadoComFaca();
    }

    @Override
    public void lutar() {
        System.out.println("Estilo de Luta da Rainha");
    }
}
