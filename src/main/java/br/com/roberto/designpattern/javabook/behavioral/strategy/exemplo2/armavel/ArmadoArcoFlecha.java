package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel;

public class ArmadoArcoFlecha implements Armavel{

    @Override
    public void useArma() {
        System.out.println("Atirar uma flecha com Arco");
    }
}
