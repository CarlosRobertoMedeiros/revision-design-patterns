package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.armavel;

public class ArmadoEspada implements Armavel{

    @Override
    public void useArma() {
        System.out.println("Manuseando uma espada");
    }
}
