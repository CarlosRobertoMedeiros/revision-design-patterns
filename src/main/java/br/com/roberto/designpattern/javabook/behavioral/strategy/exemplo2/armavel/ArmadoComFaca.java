package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel;

public class ArmadoComFaca implements Armavel{

    @Override
    public void useArma() {
        System.out.println("Cortar com Faca");
    }
}
