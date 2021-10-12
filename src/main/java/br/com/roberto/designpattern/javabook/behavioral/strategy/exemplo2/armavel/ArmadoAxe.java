package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel;

public class ArmadoAxe implements Armavel{

    @Override
    public void useArma() {
        System.out.println("Cortar com um Machado");
    }
}
