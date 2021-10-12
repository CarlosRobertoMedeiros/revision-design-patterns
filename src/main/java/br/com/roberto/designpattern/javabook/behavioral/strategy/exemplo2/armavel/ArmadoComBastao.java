package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel;

public class ArmadoComBastao implements Armavel{

    @Override
    public void useArma() {
        System.out.println("Bater com Bastão");
    }
}
