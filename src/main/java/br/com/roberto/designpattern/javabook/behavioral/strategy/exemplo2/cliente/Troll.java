package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel.ArmadoComBastao;

public class Troll extends Jogador{

    public Troll() {
        armavel = new ArmadoComBastao();
    }

    @Override
    public void lutar() {
        System.out.println("Estilo de Luta do Troll");
    }
}
