package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

import br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel.ArmadoEspada;

public class Rei extends Jogador{

    public Rei() {
        armavel = new ArmadoEspada();
    }

    @Override
    public void lutar() {
        System.out.println("Estilo de Luta do Rei");
    }
}
