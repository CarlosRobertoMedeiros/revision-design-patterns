package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel.ArmadoAxe;

public class Guerreiro extends Jogador{

    public Guerreiro() {
        armavel = new ArmadoAxe();
    }

    @Override
    public void lutar() {
        System.out.println("Estilo de Luta do Guerreiro");
    }
}
